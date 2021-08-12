package com.aniket;

import java.util.Scanner;

public class Switchfruit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit= in.next();
        switch (fruit) {
            case "MANGO" -> System.out.println("king of fruits");
            case "ORANGE" -> System.out.println("NAGpur king");
            case "WATERMELON" -> System.out.println("summer fruit");
            default -> System.out.println("unknown fruit");
        }


    }
}
