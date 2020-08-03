package com.obslugaPlikow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PracazPlikamiCzytanie {
    //In the following example, we use the Scanner class to read the contents of the text file we created in the previous chapter:
    //To get more information about a file, use any of the File methods:

    public static void main(String[] args) throws IOException {
        try {
            File myObj2 = new File("filename.txt");
            Scanner myReader = new Scanner(myObj2);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        File myObj = new File("filenamexxx.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else if (myObj.createNewFile()) {//tworzy nowy plik
            System.out.println("File created: " + myObj.getName());
        } else if (myObj.delete()) {//usuwa plik
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }

    }

    //Note: There are many available classes in the Java API that can be used to read and write files in Java:
    // FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream,
    // etc. Which one to use depends on the Java version you're working with and whether you need to read bytes
    // or characters, and the size of the file/lines etc.

//aby usunuac folder tak samo jak wyzej ale poda sciezke:
    //File myObj = new File("C:\\Users\\MyName\\Test");
    //    if (myObj.delete()) {
    //      System.out.println("Deleted the folder: " + myObj.getName());
    //    } else {
    //      System.out.println("Failed to delete the folder.");
    //    }
}
