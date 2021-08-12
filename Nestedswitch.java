package com.aniket;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit= in.next();
        String features= in.next();
        switch (fruit) {
            case "MANGO":
                System.out.println("king of fruits");
                break;
            case "ORANGE":
                System.out.println("NAGpur king");
                break;
            case "WATERMELON":
                switch (features) {
                    case "sweet":
                        System.out.println("SWEET");
                        break;
                }
                break;

            default:
                System.out.println("unknown fruit");
                break;
        }


    }
}



