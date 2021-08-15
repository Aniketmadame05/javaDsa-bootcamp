package com.functions;

import java.util.Scanner;

public class Naturalnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int  result=solution(num);
        System.out.println(result);
    }

    public static int solution(int n) {
       int sum=0;
        for(int i=0;i<=n;i++){
           sum=sum+i;
        }return sum;
    }
}

