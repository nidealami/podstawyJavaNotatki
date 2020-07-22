package com.zaawansowaneJavaBlok2;

import java.util.Scanner;

class ScannerX {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}

