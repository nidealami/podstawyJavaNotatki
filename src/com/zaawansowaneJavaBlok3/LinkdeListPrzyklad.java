package com.zaawansowaneJavaBlok3;

import java.util.Collections;
import java.util.LinkedList;

//tak samo jak ArrayList - te same funkcje

//It is best to use a LinkedList when://
//    You only use the list by looping through it instead of accessing random items
//    You frequently need to add and remove items from the beginning or middle of the
//    list

//addFirst() 	Adds an item to the beginning of the list.
//addLast() 	Add an item to the end of the list
//removeFirst() 	Remove an item from the beginning of the list.
//removeLast() 	Remove an item from the end of the list
//getFirst() 	Get the item at the beginning of the list
//getLast() 	Get the item at the end of the list

public class LinkdeListPrzyklad {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
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
