package com.podstawyJavaBlok2;

public class NumeryClass {
    //WAZNE: The void keyword, used in the examples above, indicates that
    // the method should not return a value.
    // If you want the method to return a value,
    // you can use a primitive data type (such as int, char, etc.)
    // instead of void, and use the return keyword inside the method:
    static int myMethod(int x, int y) {
        return x + y;
        //jak juz mamy int to musi byc retur, bo ze zwyklym sout bedzie blad
    }

    public static void main(String[] args) {
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}


// Outputs 8 (5 + 3)


