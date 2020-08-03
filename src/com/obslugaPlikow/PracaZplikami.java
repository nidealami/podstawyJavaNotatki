package com.obslugaPlikow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracaZplikami {

    //The File class has many useful methods for creating and getting information about files. For example:
        //Method 	         Type 	    Description
    //canRead() 	        Boolean 	Tests whether the file is readable or not
    //canWrite() 	        Boolean 	Tests whether the file is writable or not
    //createNewFile() 	    Boolean 	Creates an empty file
    //delete() 	            Boolean 	Deletes a file
    //exists() 	            Boolean 	Tests whether the file exists
    //getName() 	        String 	    Returns the name of the file
    //getAbsolutePath() 	String 	    Returns the absolute pathname of the file
    //length() 	            Long 	    Returns the size of the file in bytes
    //list() 	            String[] 	Returns an array of the files in the directory
    //mkdir() 	            Boolean 	Creates a directory

    //To create a file in Java, you can use the createNewFile() method. This method returns a boolean value:
    // true if the file was successfully created, and false if the file already exists. Note that the method
    // is enclosed in a try...catch block. This is necessary because it throws an IOException if an error occurs
    // (if the file cannot be created for some reason):

    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
           // File myObj2 = new File("C:\\Users\\MyName\\filename2.txt"); //robi plik do miejsca w  scieżce
            FileWriter myObj2 = new FileWriter("filename2.txt"); //umozliwia napisanie w pliku
            myObj2.write("Files in Java might be tricky, but it is fun enough!"); //pisze w pliku
            myObj2.close();//zamyka pisanie w pliku

            System.out.println("Successfully wrote to the file.");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
