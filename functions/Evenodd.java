package com.functions;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println(func(num));
    }
    public static String func(int n){

        if(n%2==0){
           return "this is Even number";
        }
        else{
            return "this is odd number";
        }

}
}
