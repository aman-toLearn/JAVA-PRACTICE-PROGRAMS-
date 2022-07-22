package com.aman;

public class MaxWealth {

    public static void main(String[] args){

    }
    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        //person = row
        //account = col
        for (int person = 0; person< accounts.length ; person++) {
//when we start a new row take a new sum bcoz itis for a new person
int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+= accounts[person][account];
            }
            //now we have sum of persons balance compare krna hai
            //for overall ans
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
