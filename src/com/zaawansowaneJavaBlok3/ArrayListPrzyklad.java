package com.zaawansowaneJavaBlok3;

import java.util.ArrayList;
import java.util.Collections;

//To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types,
// use: Boolean for boolean, Character for char, Double for double


//It is best to use an ArrayList when:
////    You want to access random items frequently
//    You only need to add or remove elements at the end of the list

public class ArrayListPrzyklad {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");//dodaje element
        cars.clear();//czyści wszystkie elementy z listy
        cars.add("Tipo");
        cars.add("Seat");
        cars.add("Audi");
        cars.add("BMW");
        cars.get(0);//aby dostac sie do pierwszego elementu
        cars.set(0, "Opel");//modyfikuje pierwszy element na Opel
        cars.remove(0);//usuwa pierwszy element
        Collections.sort(cars);//robi kolekcje i sortuje
        cars.size();//poie ile elementow jest na liscie
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

}
