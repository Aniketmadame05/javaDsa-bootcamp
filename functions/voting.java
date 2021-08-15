package com.functions;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        voting(age);
    }
    public static void voting(int age){
        if(age>=18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are child you cannot vote");
        }
    }
}
