package com.zaawansowaneJavaBlok3;

public class Wrappery {
    //Primitive Data Type 	Wrapper Class
//byte 	Byte
//short 	Short
//int 	Integer
//long 	Long
//float 	Float
//double 	Double
//boolean 	Boolean
//char 	Character
//
//Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
// where primitive types cannot be used (the list can only store objects)

    //aby zamienic jeden typ na drugi:
    public static void main(String[] args) {
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());

        Integer mineInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(mineInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}
