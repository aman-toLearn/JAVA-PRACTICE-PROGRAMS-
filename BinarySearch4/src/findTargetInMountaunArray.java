public class findTargetInMountaunArray {

    public static void main(String[] args){
        int[] arr = { 1,2,3,4,5,3,1};
        int target = 3;


    }
    int search(int[] arr,int target){
        int peak = findPeakIndexInMountainArray( arr);
        int firstTry = orderagnosticbs(arr,target ,0,peak);

        if(firstTry!=-1){
            return firstTry;
        }
        return orderagnosticbs(arr,target ,peak+1,arr.length-1);
    }

    static int findPeakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            // agar mid wala element (mid+1) wale element se bdaa hai too peak element left m hoga orr wo arr[mid]
            //bhi ho skta hai orr previous elements m bhi ho skta hai
            //usko search krne k liye  mid ko end bna denge
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{  //arr[mid]<arr[mid+1] yani ki peak element right side m milega
                //usko search krne k liye start ko (mid+1) kr denge kyuki mid too already (mid+1) se chhota hai

                start = mid+1;
            }
            //at the end start and end ek hi element pe aa jaaayenge

        }
        return start; //return end;
    }

    static int orderagnosticbs(int[] arr,int target ,int start,int end){

//        int start = 0;
//        int end = arr.length-1;

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
