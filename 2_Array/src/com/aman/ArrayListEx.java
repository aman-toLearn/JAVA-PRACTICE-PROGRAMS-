package com.aman;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        System.out.println(list.contains(2));
//        System.out.println(list.set(0,9999));
//
//        list.remove(3);
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());

        }
        //to print
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); //pass index here ,list[index] syntax will not work here


        }

    }
}
