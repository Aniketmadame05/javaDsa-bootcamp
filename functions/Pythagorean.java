package com.functions;

public class Pythagorean {
    public static void main(String[] args) {
      //int a=8, b=15, c=17;
        solution(8,15,17);
    }
    public static void solution(int a,int b,int c){
       if((a * a) + (b * b) == (c * c)){
           System.out.println("it is Pythagoreon Triplet");

       }
       else{
           System.out.println("is is not pythagoreon Triplet");
       }
    }
}
