/*
Write a program that asks the user to enter the name of a file, and then asks the user to
enter a character. The program should count and display the number of times that the
specified character appears in the file. Use Notepad or another text editor to create a simple
file that can be used to test the program.

 */
package basic_practice_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P13_Loop_And_File {

    public static void main(String[] args) {

        System.out.print("Enter File name :: ");
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();

        File file = new File(fName);

        //exit if file doesn't exists
        if (!file.exists()) {
            System.out.println(fName + " Doesn't exists :(");
            System.exit(1);
        }

        System.out.print("Enter the character to be count form " + fName + " :: ");
        String str = sc.next();
        char ch = str.charAt(0);

        try {
            Scanner output = new Scanner(file);

            int chCount = 0;
            while (output.hasNext()) {

                //here the problem is indexOf method will count only one occurrence of that character :(
//                String token = output.next();
//                if (token.indexOf(ch) != -1)
//                    chCount++;

                //So using String's contains method by some trick :)
//                if(output.next().contains(Character.toString(ch))) // --> trick 1
                if (output.next().contains("" + ch)) // --> trick 2
                    chCount++;
            }
            System.out.println("The character :: " + ch + " is present " + chCount + " times in the file :)");

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
