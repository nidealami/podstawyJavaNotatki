package com.zaawansowaneJavaBlok3;

import java.util.ArrayList;
import java.util.Iterator;

//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
// It is called an "iterator" because "iterating" is the technical term for looping.
//The iterator() method can be used to get an Iterator for any collection
//To loop through a collection, use the hasNext() and next() methods of the Iterator
//Iterators are designed to easily change the collections that they loop through.
// The remove() method can remove items from a collection while looping.

public class InteratorPrzyklad {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
