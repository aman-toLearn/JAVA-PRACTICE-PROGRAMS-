package com.Aman;

import java.util.Arrays;

public class _15VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,54,54,43);
       multiple(3,4,"adman","skew");


    }
    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
