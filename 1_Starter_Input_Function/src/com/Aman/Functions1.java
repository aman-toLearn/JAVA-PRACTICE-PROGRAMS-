package com.Aman;

import java.util.Scanner;

public class Functions1 {
    public static void main(String[] args) {
//greeting();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String naam = in.next();
 String messager = greets(naam);
        System.out.println(messager);
    }

     static String greets(String name) {
        String message = "Hello "+name;
                return message;
    }


    static void greeting(){
        System.out.println("Hello world");
    }
}
