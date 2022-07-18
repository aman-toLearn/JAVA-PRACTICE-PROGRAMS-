package com.aman;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
/*
*     1 2 3
*     4 5 6
*     7 8 9
*
*
* */
        Scanner sc = new Scanner(System.in);
       // int[][] arr = new int[3][3];// number of rows is mandotary column is not mandatory

//        int[][] arr2D = {
//                {1,2,3},//0th index
//                {4,5},//1st index arr2D[1] = {4,5}
//                {6,7,8,9} //2nd index  //individual size of array can be vary
//        } ;

        int[][] arr2D = new int[3][3];
        System.out.println(arr2D.length);

        //Input
        for (int row = 0; row < arr2D.length; row++) {

            //for each col in every row
            for (int col = 0; col < arr2D[row].length; col++) {

                arr2D[row][col] = sc.nextInt();


            }

        }
        //output
        for (int row = 0; row < arr2D.length; row++) {

            //for each col in every row
            for (int col = 0; col < arr2D[row].length; col++) {

                System.out.print(arr2D[row][col] + " ");


            }
            System.out.println();

        }
        // another way we can print it
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }
        //another way
        for(int[] a : arr2D){
            System.out.println(Arrays.toString(a));
        }

    }

}
