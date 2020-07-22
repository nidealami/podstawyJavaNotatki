package com.zaawansowaneJavaBlok2;

public class Enkapsulacja {
    //Metoda get zwraca wartość zmiennej, a metoda set ustawia wartość.
    public class Person {
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }

//    Better control of class attributes and methods
//    Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
//    Flexible: the programmer can change one part of the code without affecting other parts
//    Increased security of data

}
