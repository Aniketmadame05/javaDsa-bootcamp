package com.functions;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int marks=sc.nextInt();
        marksheet(marks);

    }
    public static void marksheet(int m){
      if(m>=90){
          System.out.println("A1 GRADE");
      }
      else if(m>=80){
          System.out.println(" A2 GRADE");
      }
      else if(m>=70){
          System.out.println(" B1 GRADE");
      }
      else if(m>=60){
          System.out.println(" B2 GRADE");
      }
      else if(m>=50){
          System.out.println(" C1 GRADE");
      }
      else if(m>=35){
          System.out.println("C2 GRADE");
      }
      else if(m>=0){
          System.out.println("F GRADE");
      }
      else{
          System.out.println("invalid");
      }
    }
}
