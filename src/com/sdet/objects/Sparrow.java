package com.sdet.objects;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(int numLegs, String noise, String color) {
        super(numLegs, noise, color);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
