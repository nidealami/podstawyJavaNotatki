package com.zaawansowaneJavaBlok3;

import java.util.HashSet;

//A HashSet is a collection of items where every item is unique
//Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double

public class HashSetPrzyklad {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");//dodajemy element
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println(cars.contains("Mazda"));//aby sprawdzic czy jest na liscie ten element
        cars.remove("Volvo");//aby usunac element
        cars.clear();//aby usunac wszystkie elementy
        cars.size();//aby sprawdzic dlugosc kolekcji

    }
}
