package com.przykladyZadanIslowZakazanych;

//The super keyword refers to superclass (parent) objects.
//
//It is used to call superclass methods, and to access the superclass constructor.
//
//The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses
// that have methods with the same name.
//
//To understand the super keyword, you should have a basic understanding of Inheritance and Polymorphism.

class AnimalSuper {
    // Superclass (parent)
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends AnimalSuper { // Subclass (child)
    public void animalSound() {
        super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow");
    }
}

class MyMainClass {
    public static void main(String args[]) {
        AnimalSuper myDog = new Dog(); // Create a Dog object
        myDog.animalSound(); // Call the method on the Dog object
    }
}
