package com.zaawansowaneJavaBlok2;


//public 	The class is accessible by any other class
//default 	The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
//   private 	The code is only accessible within the declared class
//    protected 	The code is accessible in the same package and subclasses.

//-------------------------------
//    final -	Attributes and methods cannot be overridden/modified
//    static -	Attributes and methods belongs to the class, rather than an object
//    abstract -	Can only be used in an abstract class, and can only be used on methods.
//    The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
//    transient -	Attributes and methods are skipped when serializing the object containing them
//    synchronized -	Methods can only be accessed by one thread at a time
//    volatile -	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

// Code from filename: Person.java
// abstract class
abstract class ModyfikatoryDostepu {
    public String fname = "John";
    public int age = 24;

    public abstract void study(); // abstract method
}

// Subclass (inherit from Person)
class Student extends ModyfikatoryDostepu {
    public int graduationYear = 2018;

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Person)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}

