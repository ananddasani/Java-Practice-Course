//Program to copy data of source file to target file using File io in java
package basic_oop_pakage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oop_22_copying_data_from_1_file_to_another {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //take a source file
        System.out.print("\nEnter file name (source) :: ");
        String sFile = sc.nextLine();

        //now create a file instance of source file
        File sourceFile = new File(sFile);

        //check if source file exists ?
        if (!sourceFile.exists()) {
            System.out.println("source file ::  " + sFile + " doesn't exists :(");
            System.exit(1);
        }

        // take a name for destination file to write copied data
        System.out.print("\nEnter file name (Destination) :: ");
        String dFile = sc.nextLine();

        //now create a file instance of source file
        File destFile = new File(dFile);

        //Prevent the duplication of file
        if (destFile.exists()) {
            System.out.println("Destination file " + dFile + " already exists :(");
            System.exit(2);
        }

        //try-with-resources
        try (
                //create input and output file
                Scanner input = new Scanner(sourceFile); //takes data form source file
                PrintWriter output = new PrintWriter("destFile") //Creates new file and writes data
        ) {
            while (input.hasNext()) {

                String s1 = input.nextLine(); //copy
                output.println(s1); //paste

//                output.println(input.nextLine()); --> direct ;)
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
            e.printStackTrace();
        }

        System.out.println("Successful :)");
    }
}
