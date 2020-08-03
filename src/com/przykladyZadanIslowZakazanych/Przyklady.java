package com.przykladyZadanIslowZakazanych;

import java.util.Scanner;

public class Przyklady {

    static class Dodawanie {
        public static void main(String[] args) {
            int x,y,sum;
            Scanner myObj = new Scanner(System.in);
            System.out.println("Type a number: ");
            x=myObj.nextInt();

            System.out.println("Type next number: ");
            y=myObj.nextInt();

            sum=x+y;
            System.out.println("sum of those numbers: "+sum);
        }
    }
}
