package com.Aman;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        //    Q.Take input of two numbers and print the sum.
//        Scanner in = new Scanner(System.in);
//         int num1,num2,sum;
//        System.out.print("Enter number1:");
//          num1 = in.nextInt();
//
//        System.out.print("Enter number2:");
//         num2 = in.nextInt();
//
//         sum = num1+num2;
//        System.out.println("The sum = " + sum);

        /*
        so here we learned how to do sum but suppose that this same thing we have to for hun
        dred times then we have to rewrite it again and again and the process is very tidious and lengthy
        so the concept of functions is introduced a function in a class is called method ok

         */
        sum();
        sum();
        sum();
    }
static void sum()
    {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter number1:");
        num1 = in.nextInt();

        System.out.print("Enter number2:");
        num2 = in.nextInt();

        sum = num1+num2;
        System.out.println("The sum = " + sum);
    }


}
