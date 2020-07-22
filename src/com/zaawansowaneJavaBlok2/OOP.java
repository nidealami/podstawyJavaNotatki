package com.zaawansowaneJavaBlok2;

public class OOP {
    //OOP stands for Object-Oriented Programming
    //Programowanie proceduralne polega na pisaniu procedur lub metod wykonujących operacje na danych,
    // podczas gdy programowanie zorientowane obiektowo polega na tworzeniu obiektów zawierających
    // zarówno dane, jak i metody.
    //    OOP jest szybsze i łatwiejsze do wykonania
    //    OOP zapewnia przejrzystą strukturę programów
    //    OOP pomaga utrzymać kod Java DRY „Don't Repeat Yourself” i sprawia, że ​​kod jest łatwiejszy w utrzymaniu, modyfikowaniu i debugowaniu
    //    OOP umożliwia tworzenie aplikacji wielokrotnego użytku z mniejszą ilością kodu i krótszym czasem programowania


    int x = 10;

    public static void main(String[] args) {
        OOP myObj = new OOP();
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);


        //The dot (.) is used to access the object's attributes and methods.
        //
        //To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
    }

}

