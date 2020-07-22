package com.zaawansowaneJavaBlok2;

public class Konstruktor {
//-----------Constructor:
//Note that the constructor name must match the class name, and it cannot have a return type (like void).
//Also note that the constructor is called when the object is created.
//All classes have constructors by default: if you do not create a class constructor yourself,
// Java creates one for you. However, then you are not able to set initial values for object attributes.
// Create a MyClass class


    int x;  // Create a class attribute

    // Create a class constructor for the MyClass class
    public Konstruktor() {
        x = 5;  // Set the initial value for the class attribute x
    }


    public static void main(String[] args) {
        Konstruktor myObj = new Konstruktor(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}

