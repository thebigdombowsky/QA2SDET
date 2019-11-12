package com.sdet;


public class Animal {

    protected int numLegs;
    protected String noise;
    protected String color;

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

    void eat() {

        System.out.println("Yummy!");

    }

    void makeNoise() {

        System.out.println(noise);

    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numLegs=" + numLegs +
                ", noise='" + noise + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[]args) {

        Animal dog = new Animal(4, "bark", "brown");

        dog.eat();
        dog.makeNoise();
        dog.move();

        dog.setNumLegs(3);
        dog.setNoise("Woof!");
        dog.setColor("Red");

        System.out.println(dog.getNumLegs());
        System.out.println(dog.getNoise());
        System.out.println(dog.getColor());

        System.out.println(dog.toString());

        Animal cat = new Animal(4, "meow", "black");
        cat.eat();
        cat.makeNoise();
        cat.move();

        cat.setNumLegs(6);
        cat.setNoise("Purr!");
        cat.setColor("Orange tabby");

        System.out.println(cat.getNumLegs());
        System.out.println(cat.getNoise());
        System.out.println(cat.getColor());

        System.out.println(cat.toString());

        Fish fish = new Fish(2, "Do fish make noise?", "yellow");
        fish.eat();
        fish.makeNoise();
        fish.move();

        fish.setNumLegs(4);
        fish.setNoise("Glub, glub!");
        fish.setColor("Purple");

        System.out.println(fish.getNumLegs());
        System.out.println(fish.getNoise());
        System.out.println(fish.getColor());

        System.out.println(fish.toString());
    }

}



