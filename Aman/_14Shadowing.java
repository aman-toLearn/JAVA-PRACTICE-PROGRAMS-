package com.Aman;

public class _14Shadowing {
   static int x = 90;// this will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x);
        int x;//class variable at line 4 is shadowed by this
        //scope will begin when value is initialised
        x = 40;
        System.out.println(x);

        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
