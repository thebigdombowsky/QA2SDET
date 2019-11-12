package com.sdet;

public class Zoo {

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

        Fish fish = new Fish("Do fish make noise?", "yellow");
        fish.eat();
        fish.makeNoise();
        fish.move();

        fish.setNoise("Glub, glub!");
        fish.setColor("Purple");

        System.out.println(fish.getNoise());
        System.out.println(fish.getColor());

        System.out.println(fish.toString());

        Bird bird = new Bird(2, "Cheep", "White") {};

        bird.fly();
        bird.eat();
        bird.makeNoise();
        bird.move();

        bird.setNumLegs(1);
        bird.setNoise("Squack!");
        bird.setColor("Black");

        System.out.println(bird.getNumLegs());
        System.out.println(bird.getNoise());
        System.out.println(bird.getColor());

        System.out.println(bird.toString());

    }
}
