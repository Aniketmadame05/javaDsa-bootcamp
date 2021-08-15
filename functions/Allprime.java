package com.functions;

import java.util.Scanner;      //*******find the prime numbers between two numbers*******//

public class Allprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int flag;
        for(int i=n1;i<=n2;i++){
               if(solution(i))        {

                   System.out.println(i);
               }
        }     

    }

    public static boolean solution(int n) {

          if (n <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
}




 




