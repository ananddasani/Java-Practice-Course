/*
15. Uppercase File Converter
Write a program that asks the user for the names of two files. The first file should be opened
for reading and the second file should be opened for writing. The program should read
the contents of the first file, change all characters to uppercase, and store the results in the
second file. The second file will be a copy of the first file, except that all the characters will
be uppercase. Use Notepad or another text editor to create a simple file that can be used
to test the program.
 */
package basic_practice_package;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class P16_UpperCase_File_Converter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //take first file as source file
        System.out.println("Enter File Name :: ");
        String sourceFile = sc.next();

        //create file instance of source file
        File file1 = new File(sourceFile);

        //check for existence
        if (!file1.exists()) {
            System.out.println(sourceFile + " Doesn't exists :(");
            System.exit(1);
        }

        //take second file name
        System.out.println("Enter file Name to store content of " + sourceFile + " :: ");
        String destFile = sc.next();

        //create file instance of dest file
        File file2 = new File(destFile);

        //check for non existence of dest file
        if (file2.exists()) {
            System.out.println(destFile + " already exists :(");
            System.exit(2);
        }

        try (
                //create scanner for taking input form file 1 (source )
                Scanner input = new Scanner(file1); // --> now source file is opened in reading mode

                //create PrintWriter instance for writing data to the dest file
                PrintWriter output = new PrintWriter(file2) // --> now dest file is in opened in writing mode
        ) {
            while (input.hasNext()) {
                //copy content form file1
                output.println(input.nextLine().toUpperCase()); // --> also writing to file2
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Copied !!");
    }
}
