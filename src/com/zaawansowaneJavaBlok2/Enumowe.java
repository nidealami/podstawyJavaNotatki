package com.zaawansowaneJavaBlok2;

public class Enumowe {
    enum Level {
        siatka, piłka
    }

    public static class NowaKlasa {
        public static void main(String[] args) {
            Level myVar = Level.siatka;
            System.out.println(myVar);
            switch (myVar) {
                case piłka:
                    System.out.println("piłka");
                    break;
                case siatka:
                    System.out.println("siatka");
                    break;
            }
        }
    }
}
//Enums are often used in switch statements to check for corresponding values:
//An enum is a special "class" that represents a group of constants (unchangeable variables,
// like final variables).
//
//To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
// Note that they should be in uppercase letters:

//The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
//for (Level myVar : Level.values()) {
//  System.out.println(myVar);
//}

//
//Difference between Enums and Classes
//
//        An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
//
//        An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
//        Why And When To Use Enums?
//
//        Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.