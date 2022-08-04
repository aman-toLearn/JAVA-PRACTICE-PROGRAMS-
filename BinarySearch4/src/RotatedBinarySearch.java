import java.io.*;
public class RotatedBinarySearch {
    public static void main(String[] args){
int[] arr = {1};
//        System.out.println(findPivot(arr));
        int target = 0;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums,int target){
int pivot = findPivot(nums);
//if we dont have a pivot it means the array is not rotated

       if(pivot == -1 ){     //|| nums.length == 1
            // just do normal binary search
             return binarysearch(nums,target,0,nums.length-1);
        }

        // if pivot is found you have found 2 ascending arrays
        if(nums[pivot] == target ){
            return pivot;
        }
        if(target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);

        }
        //otherwies from pivot+1 to end
        return binarysearch(nums,target,pivot+1,nums.length-1);



    }
//binary search
    static int binarysearch(int[] arr,int target,int start ,int end ){


        while(start<=end){
            //find middle
//            int mid = (start+end)/2;
            //this might be possible that (start+end) might exceeds the range of int
            //so we use this
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }

    static int findPivot(int[] arr){


int start = 0;
int end = arr.length-1;

while(start<=end){

    int mid = start+(end-start)/2;
    //4 cases over here

    //case1
    if( mid<end &&arr[mid]>arr[mid+1]){
        return mid;
    }

    //case2
    if( mid>start && arr[mid]<arr[mid-1]){
        return mid-1;
    }
    //case3
    if(arr[mid]<=arr[start]){
        end = mid-1;
    }
    else{
        start = mid+1;
    }

}


   return -1; }
}
