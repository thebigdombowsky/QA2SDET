package com.sdet.objects;

public class Fish  extends Animal{

    public Fish() {
    }

    public Fish(String noise, String color) {
    }


    @Override
    void move() {
       System.out.println("I'm swimming!");
    }

    @Override
    public String toString() {
        return "Fish{" +
                   "noise='" + this.noise + '\'' +
                ", color='" + this.color + '\'' +
                '}';
    }
}

