/*
14. File Head Display
Write a program that asks the user for the name of a file. The program should display only
the first five lines of the file’s contents. If the file contains fewer than five lines, it should
display the file’s entire contents.
 */
package basic_practice_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P14_File_Head_Display {

    public static void main(String[] args) {

        System.out.print("Enter File Name :: ");
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();

        File file = new File(fName);

        if (!file.exists()) {
            System.out.println(fName + " Doesn't exists :(");
            System.exit(1);
        }

        try {
            //Scanner instance for reading from the file
            Scanner output = new Scanner(file);

            int i = 1;
            while (output.hasNext() && i <= 5) {
                System.out.println(output.nextLine());
                i++;
            }

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
