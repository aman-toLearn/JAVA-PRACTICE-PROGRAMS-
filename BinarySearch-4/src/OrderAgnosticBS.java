public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {99,90,89,78,67,56,45,34};
        int target = 90;

        System.out.println(orderagnosticbs(arr,target));

    }
    static int orderagnosticbs(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

//find whether the array is sorted in ascending or descending
boolean isAsc=arr[start]<arr[end];




        while(start<=end){
            //find middle
//            int mid = (start+end)/2;
            //this might be possible that (start+end) might exceeds the range of int
            //so we use this
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
if(isAsc) {
    if (target < arr[mid]) {
        end = mid - 1;
    } else if (target > arr[mid]) {
        start = mid + 1;
    }
}
           else{
    if (target > arr[mid]) {
        end = mid - 1;
    } else if (target < arr[mid])//or we can use only else here by removing bracket condition bcoz we know that the if part is not execute then its reverse will true i {
        start = mid + 1;
    }
           }

        return -1;  }



    }

