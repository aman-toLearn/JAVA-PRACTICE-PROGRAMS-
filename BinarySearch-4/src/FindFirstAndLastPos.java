public class FindFirstAndLastPos {

    public static void main(String[] args){
      int[] nums = {12,13,14,14,14,16,17};
      int target = 14;

        int[] output= (searchRange(nums,target ));
        System.out.print(output[0]);
        System.out.print(",");
        System.out.print(output[1]);
//        //to print the output in array format
//        System.out.print("[");
//        for (int i = 0; i < output.length; i++) {
//            System.out.print(output[i] + ",");
//        }
//        System.out.print(output[output.length]+"]");
//
//
//




    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
int start = search(nums,target,true);//to find start :
        //:how? suppose mid mila target lekin target too left wale bche huye arr
        //m bhi ho skta hai na too ye true hoga too end ko mid-1 krke left
        //wale m orr search krenge
int end = search(nums,target,false);//to find end
        //how? ab mid jo ki targt mila hai wo right wale arr m again ho skta hai
        //too ye dekhne k liye right m search krenge
        //uske liye start = mid+1 kr denge
        // in the end conclusion is ki 2 baar binary search lgg gya compxO(logN) hoo gai
ans[0] = start;
ans[1] = end;
return ans;
    }
   static int search(int[] nums,int target ,boolean FindStartIndex){
      int ans = -1;

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            } else if (target>nums[mid]) {
                start = mid+1;

            }
            else{
                //potential ans found
                ans = mid;
                if(FindStartIndex==true){
                    end = mid-1;
            }
                else {
                    start = mid+1;
                }
        }


    }
       return ans;
}
}
