package com.aniket;

import java.util.Scanner;

public class Temperature{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float farheniet =input.nextFloat();
        float celsius;
        celsius=(farheniet-32)*5/9;
        System.out.println(celsius);
    }

}
// celsius to farheniet(0°C × 9/5) + 32 = 32°F
//farheniet to celsius(32°F − 32) × 5/9 = 0°C




