package com.Aman;

public class ScopingFunction4<fori> {
    public static void main(String[] args) {
        int a = 10;
        int v = 29;
        {
       //This is a block
           // int a = 30;// already initialized in the same method hence we can not initialize again ;
            a = 1000;
            // but we can change the value it will be printed
            System.out.println(a);
            int c = 30;
            //values initialized in this block will remain in this block
        }
        int c = 56;
        System.out.println(c);
        System.out.println(a);
       // System.out.println(c); will not print bcoz out of its block
        for (int i = 0; i < 4; i++) {
            System.out.println(i);

        }
        int i = 0; // we can initialize i again here bcoz anything that inity in a block we can inity that outside that block
        System.out.println(i);
    }

    //Scoping in for loops

}
