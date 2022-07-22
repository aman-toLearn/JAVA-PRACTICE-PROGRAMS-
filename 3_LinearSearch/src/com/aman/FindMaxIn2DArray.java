package com.aman;

public class FindMaxIn2DArray {
    public static void main(String[] args){
    int[][] arr = {
            {12,13,14},
            {1,2,3,4},
            {900,987,100}

    } ;
    int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[][]arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];

                }

            }
        }
        return max; }

}
