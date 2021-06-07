//program to replace A word by the new word while copying the data form one file to another file
/*
                                            Question ::
Suppose you are to write a program named ReplaceText that replaces all occurrences of a
string in a text file with a new string

For example --> replaces all the occurrences of StringBuilder by StringBuffer in the file source.txt
and saves the new file in destination.txt.
 */
package basic_oop_pakage;

import java.io.File; //for using File class
import java.io.FileNotFoundException; // for throwing exception
import java.io.PrintWriter; // for using PrintWriter class
import java.util.Scanner; // for scanning input from the keyboard

public class oop_23_replace_txt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take file name of source
        System.out.print("\nEnter file name :: ");
        String s = sc.nextLine();

        //create file instance for source
        File sourceFile = new File(s);

        //ensure that file is already exists
        if (!sourceFile.exists()) {
            System.out.println("Source " + s + " doesn't exists :(");
            System.exit(1);
        }

        System.out.print("\nEnter file name (Destination) :: ");
        String d = sc.nextLine();

        //create file instance for destination
        File destFile = new File(d);

        //ensure that file doesn't exists
        if (destFile.exists()) {
            System.out.println("Destination " + destFile + " already exists :(");
            System.exit(2);
        }

        //take oldString to replace with newString
        System.out.print("\nEnter the String you want to replace (StringBuilder):: ");
        String oldString = sc.next();

        System.out.print("\nReplace " + oldString + " with ? (StringBuffer):: ");
        String newString = sc.next();

        try (
                //create input and output file instance
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(destFile)
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine(); //copy one line form source

                //Replacing the oldString with newString
                String s2 = s1.replaceAll(oldString, newString);

                //now let's paste/write the new data to destination file
                output.println(s2);
            }
        } catch (FileNotFoundException e) { // --> catching the exception
            System.out.println("file (source) not found :(");
            e.printStackTrace();
        }
        System.out.println("\nsuccessful :)");
    }
}
