package com.zaawansowaneJavaBlok2;
//WANZE: jak nie chcesz aby po klasie tej dziedziczono,
// to ustaw final class Pojazd{}
public class DziedziczonyPojazd {
    protected String brand ="Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}
class Car extends DziedziczonyPojazd {
    private String modelName="Mustang";

    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " +myCar.modelName);
    }
}
