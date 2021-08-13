package com.aniket;

import java.util.Scanner;

public class Sumall
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //int max=0; for finding largest number
         int sum=0;

        while(true){
            String str=sc.next();
            if(str.charAt(0)== 'x' ) {
                break;
            }
            int n=Integer.parseInt(str);
            sum=sum+n;
           // if(max<n) {
             //max=n;     for finding the largest number
            // }
            }
        System.out.println(sum);

        }
    }

