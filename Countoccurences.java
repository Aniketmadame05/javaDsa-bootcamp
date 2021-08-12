package com.aniket;

public class Countoccurences {
    public static void main(String[] args) {
        int n=13234;
        int count=0;
        while (n>0)
        {
            int last=n%10;    //it gives us last digit of number
            if(last==3){
                count++;
            }
            n=n/10; //it cuts last digits from number

        }
        System.out.println(count);

    }

}
