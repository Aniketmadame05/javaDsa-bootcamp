//input a number and print whether it is prime or not
package com.aniket;

import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=1)
        {
            System.out.println("nor prime Neither composite");

        }else {
            int i = 2;

            boolean isPrime = true;

            while (i <= num/2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println("it is a prime number");
            } else {
                System.out.println("not prime");
            }
        }

    }
}
