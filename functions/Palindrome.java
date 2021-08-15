package com.functions;

public class Palindrome {
    public static void main(String[] args) {

        palin(12321);

    }
    public static void palin(int n){
     int reverse, remainder=0;
     int pro=n;
        while(n!=0){
            reverse=n%10;
            remainder=remainder*10+reverse;
            n/=10;
        }
        if(pro==remainder){
            System.out.println(pro+"  it is palindrome");

        }
        else{
            System.out.println(pro+"  not palindrome");
        }
    }
}
