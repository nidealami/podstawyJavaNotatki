package com.zaawansowaneJavaBlok3;

//Java try and catch
////The try statement allows you to define a block of code to be tested for errors while it is being executed.
////The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
////The try and catch keywords come in pairs

public class WyjatkiTRYandCATCHPrzyklady {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
