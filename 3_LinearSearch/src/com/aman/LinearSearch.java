
package com.aman;

public class LinearSearch {

    public static void main(String[] args){
        int [] numbs = {9,87,45,78,5,8,44,46,90};
        int target = 90;
        boolean result = linearsearch(numbs,target);
        System.out.println("Target element is at index"+" " + result+" " +"value is ");

    }

    static boolean linearsearch(int[] arr, int target){
        //condition
        if(arr.length == 0){
            return false;
        }
        //search
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return true;
            }

        }
        return false;
    }

}
