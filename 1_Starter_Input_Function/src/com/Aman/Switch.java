package com.Aman;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

//       if (fruit.equals("mango")){
//           System.out.println("Raja");
//       }
//       else
//           System.out.println("normal fruit hai yar ");
//
        switch (fruit) {
            case "mango":
                System.out.println("King of fruits ");
                break;

            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit ");
                break;
            case "grapes":
                System.out.println("small size fruit");
                break;
            default:
                System.out.println("please enter a valid fruit name ");
                //duplicate cases will give error
        }
//Nested case nested means switch case inside a switch case

                int empID = sc.nextInt();
                switch (empID){
                    case 1:
                        System.out.println("employee first");
                        break;

                }


    }
}

//orrr we can use this syntax also for switch cases
//        int day = sc.nextInt();
//        switch(day){
//
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesdsy");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday ");
//        }
//  Here this enhanced version of switch cases is not working because it is version 8 ok    }

