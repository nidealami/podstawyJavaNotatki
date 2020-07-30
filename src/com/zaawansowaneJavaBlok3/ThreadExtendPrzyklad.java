package com.zaawansowaneJavaBlok3;

//The major difference is that when a class extends the Thread class, you cannot extend any other class, but by
// implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass
// extends OtherClass implements Runnable.


//To avoid concurrency problems, it is best to share as few attributes between threads as possible.
// If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether
// the thread has finished running before using any attributes that the thread can change.


//It can be created by extending the Thread class and overriding its run() method:
//If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
public class ThreadExtendPrzyklad extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadExtendPrzyklad thread = new ThreadExtendPrzyklad();
        thread.start();
        // Wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);

        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
        amount++;
    }

}
