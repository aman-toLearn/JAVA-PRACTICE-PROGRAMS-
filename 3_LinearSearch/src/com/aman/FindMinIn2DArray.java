package com.aman;

public class FindMinIn2DArray {

    public static void main(String[] args ){
        int[][] arr = {
                {12,-9,23,43},
                {-99,-100,-999,0,23,-234453222}
        };
        System.out.println(Min(arr));
    }
    static int Min(int[][]arr){
        int min = Integer.MAX_VALUE;
        for(int row =0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
               if(arr[row][col]<min){
                   min=arr[row][col];
               }
            }
        }

   return min; }
}
