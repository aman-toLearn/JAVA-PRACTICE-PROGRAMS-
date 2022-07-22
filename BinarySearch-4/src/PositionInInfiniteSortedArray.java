public class PositionInInfiniteSortedArray {

    public static void main(String[] args){
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static int  ans(int[]arr,int target){
        // first find the range
        // first start with a box of size two
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range

        while(target>arr[end]){
            int temp = end+1;//this is my new start
            //double the box value
            // end = previous end + sizeofbox*2
            //size of box = (end-start+1)
            end = end +(end-start+1)*2; // isme jo = m start and end wo phle wale hai
            // jinki help se apn previous box ki size nikal rhe hai
            //hmesha se chle aa rhe formule se array ki size nikalne wale se size = end-start+1
            start = temp;

        }
return binarysearch(arr,target,start,end);//calling the binary search here with updating start and end
        //for our result
    }
    static int binarysearch(int[] arr,int target,int start,int end){

        while(start<=end){

            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;

            }
            else{
                return mid;
            }
        }
   return -1; }
}
//great question tunne binary search m else if m galti se start = end+1 likh dia thha jo ki start = mid+1 hota hai
//iski wajah se bhot time tkk tu debug krta rha