package com.aman;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 2;
//        arr[2] = 4;
//        arr[3] = 6;
//        arr[4] = 9;
        //internally what happens [23,2,4,6,9]

//        System.out.println(arr[2]);


        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //To print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        for (int num : arr) { // for every elemnet in the array,print the element
            System.out.println(num + " ");//here num represents element of the array



        }
           // System.out.println(arr[5]);//index out of bound erroe

// another method to print

        System.out.println(Arrays.toString(arr));



    //array of objects
    String[] str  = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        //printing
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "aman";
    }
}
