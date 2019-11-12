package com.sdet;

abstract class Bird extends Animal{

    public Bird(int numLegs, String noise, String color) {
        super(numLegs, noise, color);
    }

    Bird() {
    }

    void fly(){
        System.out.println("Flying!");
    }

}
