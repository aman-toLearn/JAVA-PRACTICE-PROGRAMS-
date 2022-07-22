public class FindPeakElement {

    public static void main(String[] args){
       int[] arr =  {1, 2, 3, 1};
       System.out.println(findPeakElement(arr));
    }

    //162. Find Peak Element code is exact same as previous question Peak in mountain array

    static int findPeakElement(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            // agar mid wala element (mid+1) wale element se bdaa hai too peak element left m hoga
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
}
