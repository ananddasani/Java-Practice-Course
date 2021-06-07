//Program to demonstrate how to write data to a using PrintWriter class in java
package basic_oop_pakage;

import java.io.File; //for using File class
import java.io.IOException; // for throwing IOException
import java.io.PrintWriter; // for writing data in the file
import java.util.Scanner;

public class oop_18_writing_data_using_PrintWriter {

    public static void main(String[] args) throws IOException {

        //creating the instance of file class
        File file = new File("Scores.txt");

        //if file already exists then exit the program (preventing form duplication)
        if (file.exists()) {
            System.out.println("file already exists :( ");
            System.exit(1);
        }

        //invoking the PrintWriter constructor and will create the fie on machine if  not exists
        PrintWriter output = new PrintWriter("Scores.txt"); //create a file

        //write formatted data in the file
//        output.print("Anand Dasani ");
//        output.println(90);
//        output.print("Meet Patel ");
//        output.println(80);

        // write user defined output
        Scanner sc = new Scanner(System.in);

        //taking the date form the user
        System.out.println("\t\t1st Person");

        System.out.print("Enter the name :: ");
        String name = sc.nextLine();
        System.out.print("Enter the score :: ");
        int score = sc.nextInt();

        System.out.println("\t\t2nd Person");

        sc.nextLine(); //emptying the buffer
        System.out.print("Enter the name :: ");
        String name2 = sc.nextLine();
        System.out.print("Enter score :: ");
        int score2 = sc.nextInt();

        output.print(name);
        output.println(score);

        output.print(name2);
        output.println(score2);

        //Don't forget to close the file
        output.close();

        //notify
        System.out.println("Successful :)");
    }
}
