package com.zaawansowaneJavaBlok3;

public interface LambdaInterfejsPrzyklad {

    //To use a lambda expression in a method, the method should have a parameter with
    // a single-method interface as its type. Calling the interface's method will run the lambda expression:

    String run(String str);
}

class MyClassLambda {
    public static void main(String[] args) {
        LambdaInterfejsPrzyklad exclaim = (s) -> s + "!";
        LambdaInterfejsPrzyklad ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, LambdaInterfejsPrzyklad format) {
        String result = format.run(str);
        System.out.println(result);
    }

}
