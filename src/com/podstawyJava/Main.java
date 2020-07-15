package com.podstawyJava;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

//non-primitive data types:
        String myText = "Hello";
        String name = "Anna";
        Array x;
        
//etc.

//primitive data types:
        int myNum = 30;
        int xyz = 15 + 15;
        System.out.println(myNum == xyz);
        float myFloatNum = 5.99f;
        long numSec = 68893791;
        char myLetter = 'D';
        double numThi = 636382.34321;
        boolean myBool = true;
        boolean isJavaFun = true;
        boolean isKrewetkiTasty = false;
        System.out.println("isJavaFun?: " + isJavaFun);     // Outputs true
        System.out.println("isKrewetkiTasty?: " + isKrewetkiTasty);   // Outputs false


        System.out.println("Hello " + name);
        System.out.println("you are " + myNum + " " + name);
        //myNum to identyfikator

//       A String in Java is actually an object,
//       which contain methods that can perform certain operations on strings.
//       For example, the length of a string can be found with the length() method:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


//
//            String - stores text, such as "Hello". String values are surrounded by double quotes
//            int - stores integers (whole numbers), without decimals, such as 123 or -123
//            float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//            char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//            boolean - stores values with two states: true or false


//        + 	Addition 	Adds together two values 	x + y
//        - 	Subtraction 	Subtracts one value from another 	x - y
//        * 	Multiplication 	Multiplies two values 	x * y
//        / 	Division 	Divides one value by another 	x / y
//        % 	Modulus 	Returns the division remainder 	x % y
//        ++ 	Increment 	Increases the value of a variable by 1 	++x
//        -- 	Decrement 	Decreases the value of a variable by 1 	--x


//        = 	x = 5 	x = 5
//        += 	x += 3 	x = x + 3
//        -= 	x -= 3 	x = x - 3
//        *= 	x *= 3 	x = x * 3
//        /= 	x /= 3 	x = x / 3
//        %= 	x %= 3 	x = x % 3
//        &= 	x &= 3 	x = x & 3
//        |= 	x |= 3 	x = x | 3
//        ^= 	x ^= 3 	x = x ^ 3
//        >>= 	x >>= 3 	x = x >> 3
//        <<= 	x <<= 3 	x = x << 3

//        == 	Equal to 	x == y
//        != 	Not equal 	x != y
//        > 	Greater than 	x > y
//        < 	Less than 	x < y
//        >= 	Greater than or equal to 	x >= y
//        <= 	Less than or equal to 	x <= y

//        &&  	Logical and 	Returns true if both statements are true 	x < 5 &&  x < 10
//        ||  	Logical or 	Returns true if one of the statements is true 	x < 5 || x < 4
//        ! 	Logical not 	Reverse the result, returns false if the result is true 	!(x < 5 && x < 10)


        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());


        //ciekawe:
        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); //wyjdzie że jest to 7 element zdania


        //ciekawe zamiast + :
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));


        //  Jak zrobić aby był cudzysłów;
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);


        String txt5 = "The character \\ is called backslash.";
        System.out.println(txt5); //wydrukuje tylko jedna kreske


//\n 	New Line
//\r 	Carriage Return
//\t 	Tab
//\b 	Backspace
//\f 	Form Feed


        int y = 9;
        int x1 = 4;
        //Maths:
        Math.max(x1, y);
        Math.min(x1, y);
        Math.sqrt(x1);
        Math.abs(x1);
        Math.random();
        int randomNum = (int) (Math.random() * 101);


//        Less than: a < b
//        Less than or equal to: a <= b
//        Greater than: a > b
//        Greater than or equal to: a >= b
//        Equal to a == b
//        Not Equal to: a != b


//ciekawe rozwiazanie:
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result); //rezultat to good evening

        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There is no such a day");
        }
//loop while:
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //loop do-while:
        int j = 0;
        do {
            System.out.println(i);
            j++;
        }
        while (j < 5);


        //loop for:
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
        //albo:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String m : cars) {
            System.out.println(m);
        }
//ciekawe:
        for (int e = 0; e < 10; e++) {
            if (e == 4) {
                break;
            }
            System.out.println(e);
        }

        //jako kontra tego co jest wyzej:
        for (int f = 0; f < 10; f++) {
            if (f == 4) {
                continue;
            }
            System.out.println(f);
        }
        //albo:
        int d = 0;
        while (d < 10) {
            System.out.println(d);
            d++;
            if (d == 4) {
                break;
            }
        }

        int h = 0;
        while (h < 10) {
            if (h == 4) {
                h++;
                continue;
            }
            System.out.println(h);
            h++;
            //ciekawe, bo 4 wywali z listy i przejdzie na 5, bo dodało do 4+
        }



        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum2 = {10, 20, 30, 40};

        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars3.length);

        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int g = 0; g < cars.length; g++) {
            System.out.println(cars[g]);
        }
        //albo:
        String[] cars5 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String t : cars) {
            System.out.println(t);
        }
        //ciekawe, bo najpierw sprawdzasz która kolumne odwiedzamy a potem ktory element
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int z = myNumbers[1][2];
        System.out.println(z); // Outputs 7


    }    ;
}