package com.aniket;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int a=0,b=1;
        //System.out.println(a +" "+b);

        int count=2 ;
        while (count<=n) {
            int temp=b;
            b=b+a;
            a=temp;
           // System.out.println(b); for print all fibonacci series


            count++;
        }
        System.out.println(b); //just for printing one element

    }
}
