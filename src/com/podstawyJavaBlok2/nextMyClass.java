package com.podstawyJavaBlok2;
//jak się odnieść i nadać "wartość" na raz:
public class nextMyClass {
        static void myMethod(String fname, int age) {
            System.out.println(fname + " is " + age);
        }
//fname to parametr a imiona to argumenty
        public static void main(String[] args) {
            myMethod("Liam",67);
            myMethod("Jenny",5);
            myMethod("Anja",7);
        }
    }
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes

