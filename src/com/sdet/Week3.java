package com.sdet;

public class Week3 {

public static void main(String[] args) {

        //define the initial String
        String str = "This1is2a3string4manipulation5exercise6for7engineer8your9career0week1number3Three";

        //split the string
        String[] strArray = str.split("[0-9]");

        for (int i = 0; i < strArray.length; i++) {

                strArray[i] = strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1).toLowerCase();

        }
        System.out.println(String.join(" ", strArray));
        }
        }