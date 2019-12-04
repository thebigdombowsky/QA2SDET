package com.sdet.objects;


public class Animal {

     int numLegs;
    String noise;
     String color;

//This is the default (or empty) constructor
    public Animal() {

    }

   //This is the constructor that we defined
    public Animal(int numLegs, String noise, String color) {
        this.numLegs = numLegs;
        this.noise = noise;
        this.color = color;
    }

    void move() {
        System.out.println("I'm moving...");
    }

    //    void move() {
    //       Remove body to demonstrate abstract classes
    //Any classes that extend Animal must implement the move method
    //    }

    void eat() {

        System.out.println("Yummy!");

    }

    void makeNoise() {

        System.out.println(noise);

    }

//    public int getNumLegs() {
//        return numLegs;
//    }
//
//    public void setNumLegs(int numLegs) {
//        this.numLegs = numLegs;
//    }
//
//    public String getNoise() {
//        return noise;
//    }
//
//    public void setNoise(String noise) {
//        this.noise = noise;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }


/*
    @Override
    public String toString() {
        return "Animal{" +
                "numLegs=" + numLegs +
                ", noise='" + noise + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
*/


}



