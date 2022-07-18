package com.aman;

import java.util.Arrays;

public class SwappingEle {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,8,45};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
