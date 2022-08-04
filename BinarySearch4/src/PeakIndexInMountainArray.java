public class PeakIndexInMountainArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(findPeakIndexInMountainArray(arr));

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
}
// in the end, start == end and pointing to the largest number because of the 2 checks above
// start and end are always trying to find max element in the above 2 checks
// hence, when they are pointing to just one element, that is the max one because that is what the checks say
// more elaboration: at every point of time for start and end, they have the best possible answer till that time
// and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
