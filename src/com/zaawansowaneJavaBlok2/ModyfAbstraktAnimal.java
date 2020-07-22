package com.zaawansowaneJavaBlok2;
//Why And When To Use Abstract Classes and Methods?
////To achieve security - hide certain details and only show the important details of an object.
////Note: Abstraction can also be achieved with Interfaces

//    Abstract class: is a restricted class that cannot be used to create objects
//    (to access it, it must be inherited from another class).
//    Abstract method: can only be used in an abstract class, and it does not have a body.
//    The body is provided by the subclass (inherited from).
abstract class ModyfAbstraktAnimal {//nie mogę z tego zrobić new Animal

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }

    // Abstract class
    abstract class Animal {
        // Abstract method (does not have a body)
        public abstract void animalSound();

        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from Animal)
    static class Pig extends ModyfAbstraktAnimal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }

    static class MyMainClass {
        public static void main(String[] args) {
            Pig myPig = new Pig(); // Create a Pig object
            myPig.animalSound();
            myPig.sleep();
        }
    }
}
