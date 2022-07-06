package com.Aman;

import java.util.Scanner;

public class FunctionReturn {

    public static void main(String[] args) {
      //int ans = sum();
      //  System.out.println("Storing the value that returns the function in ans " +  ans);
       String message =  greet();
        System.out.println(message);
    }
//    static int sum(){
//        Scanner in = new Scanner(System.in);
//        int num1,num2,sum;
//        System.out.print("Enter number1:");
//        num1 = in.nextInt();
//
//        System.out.print("Enter number2:");
//        num2 = in.nextInt();
//
//        sum = num1+num2;
//        return sum;
//       // System.out.println("this statement is unreachable");
  //  }
    static String greet(){
        String greeting = "hello i am returned from the function ";
        return greeting;
    }
}
