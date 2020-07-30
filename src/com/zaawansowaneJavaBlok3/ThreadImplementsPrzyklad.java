package com.zaawansowaneJavaBlok3;

//If the class implements the Runnable interface, the thread can be run by passing an instance of the class
// to a Thread object's constructor and then calling the thread's start() method:

//The major difference is that when a class extends the Thread class, you cannot extend any other class, but by
// implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass
// extends OtherClass implements Runnable.

public class ThreadImplementsPrzyklad implements Runnable {
    public static void main(String[] args) {
        ThreadImplementsPrzyklad obj = new ThreadImplementsPrzyklad();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
