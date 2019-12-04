package com.sdet.checkpoint;

import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {
        System.out.println("Input some text:");
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        count(test);

    }
    public static void count(String input) {
        char[] ch = input.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < input.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("The string is: " + input);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}