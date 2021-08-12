package com.aniket;

import java.util.Scanner;

public class Calculatorbycontrolstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Operator");
        char op = in.next().trim().charAt(0);
        int ans=0;
        while (true) {
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.println("Enter The Number");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans=num1*num2;
                }
                if(op == '/'){
                    ans=num1/num2;
                }
                if(op == '%'){
                    ans=num1%num2;
                }

           } else if(op=='x' || op=='X'){
                break;
            }
            else{
                System.out.println("invalid operator");
            }
            System.out.println(ans);
        }
    }
}