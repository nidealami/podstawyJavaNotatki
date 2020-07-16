package com.podstawyJavaBlok2;

//wciąż tego sama nie umiem tak zapetlic
//to jest jak tworzenie ciagu arytm.
public class RekurencjaWTF {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}
