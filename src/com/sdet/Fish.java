package com.sdet;

public class Fish  extends Animal{

    public Fish(int numLegs, String noise, String color) {
        if (numLegs > 0){
            System.out.println("Fish don't have legs!");
    }
    }

    public void setNumLegs(int numLegs) {
        if (this.numLegs > 0) {
            System.out.println("Fish don't have legs!");
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                   "noise='" + this.noise + '\'' +
                ", color='" + this.color + '\'' +
                '}';
    }
}

