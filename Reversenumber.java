package com.aniket;

public class Reversenumber {
    public static void main(String[] args) {
        int num=123456;
        int ans=0;
        while(num>0)
        {
            int last=num%10;

            ans=ans*10+last;  //this gives us reverse number

            num=num/10;

        }
        System.out.println(ans);
    }
}
