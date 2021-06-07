//Program to demonstrate files IO in java using java.io.File
package basic_oop_pakage;

import java.io.File; //for using file class
import java.io.IOException; // for throwing Exception
import java.util.Date; // for using the last modified method of file class

public class oop_17_Files_in_Java {

    public static void main(String[] args) throws IOException {

        //creating the instance of File class
        File myFile = new File("Anand.txt");
        // use here sort cut of ctrl+space for the automatic name suggestion after typing File

        //Creating the file on machine
        myFile.createNewFile();

        //Here are some most commonly used method of file class
        System.out.println("Doses it exists ? " + myFile.exists());
        System.out.println("The file has " + myFile.length() + " Bytes");
        System.out.println("Can it Read ? " + myFile.canRead());
        System.out.println("Can it Write ? " + myFile.canWrite());
        System.out.println("Can it Execute ? " + myFile.canExecute());
        System.out.println("It is a directory ? " + myFile.isDirectory());
        System.out.println("It is a file ? " + myFile.isFile());
        System.out.println("It is hidden ? " + myFile.isHidden());
        System.out.println("It is absolute ? " + myFile.isAbsolute());
        System.out.println("It's absolute Path is :: " + myFile.getAbsolutePath());
        System.out.println("Last modified on :: " + new Date(myFile.lastModified()));
    }
}
