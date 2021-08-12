package com.aniket;

import java.util.Scanner;

public class Multiplicationtable
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
