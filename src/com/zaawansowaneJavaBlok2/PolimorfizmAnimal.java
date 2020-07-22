package com.zaawansowaneJavaBlok2;

public class PolimorfizmAnimal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}


class Pig extends PolimorfizmAnimal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends PolimorfizmAnimal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        PolimorfizmAnimal myAnimal = new PolimorfizmAnimal();  // Create a Animal object
        PolimorfizmAnimal myPig = new Pig();  // Create a Pig object
        PolimorfizmAnimal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}


