package com.aman;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));

    }
//work on edge cases here like array being null
    static int maxRange(int[] arr, int start, int end) {
        if(start>end){
            return -1;
        }

        int max1 = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]>max1){
                max1= arr[i];
            }

        }
        return max1;
    }

    //assuming array is not empty
 static int max(int[] arr) {
//        if(arr.length == 0){
//            return -1;
//        }
        int max = arr[0];
     for (int i = 1; i < arr.length; i++) {
         if(arr[i]>max){
             max = arr[i];
         }


     }
     return max;


    }
}
