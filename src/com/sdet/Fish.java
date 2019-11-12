package com.sdet;

public class Fish  extends Animal{

    public Fish(String noise, String color) {

    }

    @Override
    public String toString() {
        return "Fish{" +
                   "noise='" + this.noise + '\'' +
                ", color='" + this.color + '\'' +
                '}';
    }
}

