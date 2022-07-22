package com.aman;

public class EvenDigits {
    public static void main(String[] args){
       int[] numbs = {12,2,3,1234,98};
       int ans = countinarrr(numbs);
        System.out.println(ans);
        System.out.println(countInDigit2(987987));
    }
    static int countinarrr(int[]numbs){
        int count =0;
        for (int numb:numbs) {
            if (even(numb)) {
                count++;
            } }
   return count;
    }

    private static boolean even(int numb) {
        int result = countInDigit(numb);
        if(result%2==0){
            return true;
        }
        return false;
    }
    static int countInDigit(int numb){//we used this function to count number of digits in a element
        //ex 1298 m 4 digit hai
        if(numb<0){
            numb = numb*-1;
        }
        if(numb==0){
            return 1;
        }

        int count=0;
        while(numb>0){
            count++;
            numb = numb/10;
        }
    return count;}

    // the second method for counting number of digits in a element ex 1287 m 4 digit hai
//or we can say optimized way
    static int countInDigit2(int numb){
   //short way to count digits in number
             return (int)(Math.log10(numb))+1;
    }
}
