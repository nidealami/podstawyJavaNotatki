package com.zaawansowaneJavaBlok3;

//HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
//One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values,
// or the same type, like: String keys and String values

//Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

import java.util.HashMap;

public class HashMapPrzyklad {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");//aby dodac element
        capitalCities.put("Germany", "Berlin");
        capitalCities.clear();//aby wywalic wszystko z listy
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Norway"));//aby cos wyciagnac z listy
        capitalCities.remove("USA");//aby usunac z listy
        capitalCities.size();//aby sprawdzic wielkosc listy

        for (String i : capitalCities.keySet()) {
            System.out.println(i);//aby wydrukowac tylko klucze
        }
        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);//aby wydrukowac wartosc
        }
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }


    }
}

