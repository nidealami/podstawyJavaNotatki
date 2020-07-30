package com.zaawansowaneJavaBlok3;

//The throw statement is used together with an exception type.
// There are many exception types available in Java: ArithmeticException,
// FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

public class WyjatkiTHROWPrzyklad {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(18); // Set age to 15 (which is below 18...)
    }
}
