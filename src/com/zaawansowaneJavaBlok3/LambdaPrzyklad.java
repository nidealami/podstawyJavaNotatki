package com.zaawansowaneJavaBlok3;

//A lambda expression is a short block of code which takes in parameters and returns a value.
// Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

//parameter -> expression
//(parameter1, parameter2) -> expression

//Expressions are limited. They have to immediately return a value, they cannot contain variables,
// assignments or statements such as if or for. In order to do more complex operations, a code block can be used with
// curly braces. If the lambda expression needs to return a value then the code block should have a return statement.
//(parameter1, parameter2) -> { code block }


import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaPrzyklad {
    //Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
    // The lambda expression should have the same number of parameters and the same return type as that method.
    // Java has many of these kinds of interfaces built in, such as the Consumer interface
    // found in the java.util package) used by lists.


//Use a lamba expression in the ArrayList's forEach() method to print every item in the list:

    //   public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(1);
//        numbers.forEach( (n) -> { System.out.println(n); } );

    //lub:

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}


