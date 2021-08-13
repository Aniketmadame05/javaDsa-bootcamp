package com.aniket;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pri=sc.nextFloat();
        float ri=sc.nextFloat();
        float t=sc.nextFloat();
        float si=(pri*ri*t)/100;
        System.out.println("simple interest is "+si);
    }
}
