package com.aniket;

import java.util.Scanner;

public class Hcfandlcm {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp, temp1, temp2, lcm, hcf;
        temp1 = num1;
        temp2 = num2;

        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp2 % temp1;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1 * num2) / hcf;

        System.out.println("Lcm :" + lcm + "\n Hcf :" + hcf);
    }
}

