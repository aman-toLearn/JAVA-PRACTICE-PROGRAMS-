package com.aman;

public class SearchInRange {
    public static void main (String[] args){
        int [] numbs = {18,9,-23,43,12,10,23};
        int target = 12;
        System.out.println(search(numbs,target,1,5));

    }
    static boolean search( int [] nums,int target,int start,int end){

        for (int i = start; i < end; i++) {
            if(target== nums[i]){
                System.out.println(i);
                return true;

            }

        }
        return false;
    }

}
