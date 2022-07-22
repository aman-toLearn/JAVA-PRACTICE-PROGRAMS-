package com.aman;

public class FindMax {
    public static void main(String[] args){
        int [] numbs = {12,-2,-900,90,78,23,22,33,44,55};
        System.out.println(Max(numbs));

    }
    static int Max(int[] numbs){
        int ans = numbs[0];
        for (int i=0;i<numbs.length;i++){
            if(numbs[i]>ans){
                ans=numbs[i];
            }
        }


        return ans;
    }
}
