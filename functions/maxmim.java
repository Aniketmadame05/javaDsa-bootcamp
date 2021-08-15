package com.functions;
//maxximum and minimum among three numbers using functions
import java.util.Scanner;

public class maxmim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int bada=maximum(n1,n2,n3);
        int cho=minimum(n1,n2,n3);
        System.out.println("the maximum among these three number is :"+bada);
        System.out.println("the minimum among these three number is:"+cho);
    }
    public static int maximum(int n1,int n2,int n3)
    {
        int max=0;
        if(n1>n2 && n1>n3){
            max=n1;
        }
        else if (n2>n3 && n2>n1){
            max=n2;
        }
        else{
            max=n3;
        }
        return max;
    }
    public static int minimum(int n1,int n2,int n3)
    {
       int min=0;
        if(n1<n2 && n1<n3){
            min=n1;
        }
        else if (n2<n3 && n2<n1){
            min=n2;
        }
        else{
            min=n3;
        }
        return min;
    }
}
