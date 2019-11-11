package com.sdet;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        example();
    }

    private static void example() {
       System.out.println("What is your name?");
       Scanner scanner = new Scanner(System.in);
       String input = scanner.next();
       System.out.println(input + " is a nice name.");

    }

}
