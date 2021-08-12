package com.aniket;

import java.util.Scanner;

public class Calculatorbyswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the operator");
        System.out.println("1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICAION \n 4.DIVISION \n 5.MODULOS");
        int op = in.nextInt();
        System.out.println("Enter The Number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;
        switch (op) {
            case 1 -> {
                ans = num1 + num2;
                System.out.println(ans);
            }
            case 2 -> {
                ans = num1 - num2;
                System.out.println(ans);
            }
            case 3 -> {
                ans = num1 * num2;
                System.out.println(ans);
            }
            case 4 -> {
                ans= num1/num2;
                System.out.println(ans);
            }
            case 5 -> {
                ans = num1 % num2;
                System.out.println(ans);
            }
            default -> System.out.println("invalid");
        }


    }
}
