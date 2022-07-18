package com.aman;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //reversing array using swap
        int[] arr = {1,2,3,4,5,3,4,5,7,999};
//        swap(arr,0,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            //swap
            swap(arr ,start,end);
                start++;
                end--;

        }
    }

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
