package com.sdet.checkpoint;

import java.util.Scanner;

public class Hello {

    public static void main(String[]args) {

        System.out.println("Hello");
        System.out.println("What is your first name?");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("\nHello " + firstName + " " + lastName);

    }
}
