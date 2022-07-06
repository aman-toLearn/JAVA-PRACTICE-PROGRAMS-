package com.Aman;


import java.util.Scanner;

class Loops {

    public static void main(String[] args) {

//        System.out.println("Hello Aman ");
//
//        Scanner input = new Scanner(System.in) ;
//        int roll = input.nextInt();
//        System.out.println("roll"+roll);

//        for(int num = 1; num<=5; num+=1)
//        {
//            System.out.println(num);
//        }

        // to n  input

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();

//        for (int num = 0; num <=n; num++) {
//            System.out.print(num + " ");
//
//        }

//        int num = 1;
//        while(num<=n)
//        {
//            System.out.println(num);
//            num+=1;
//        }
//int num = 1;
//do {
//    System.out.println(num);
//num+=1;
//}
//while(num<=9);


        Scanner input = new Scanner(System.in);
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();

                int max = a;
                if(max<b)
                {
                    max = b;
                }
                if(max<c){
                    max = c;
                }
        System.out.println("maximum of given number is :"+max);
    }


}
