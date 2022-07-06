package com.Aman;

import java.util.Scanner;

public class _18ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(ArmStrong( n));
        for (int i = 100;i<1000; i++){
            if(ArmStrong(i)){
                System.out.println((i+ " "));
            }
        }
    }
    static boolean ArmStrong(int n){
        int sum = 0;
        int original = n;
        while(n>0){

            int rem = n%10;

            sum  = sum+rem*rem*rem;
            n = n/10;

        }
        return sum == original  ;
    }
}
