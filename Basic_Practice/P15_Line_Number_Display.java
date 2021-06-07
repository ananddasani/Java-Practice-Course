/*
15. Line Numbers
Write a program that asks the user for the name of a file. The program should display the
contents of the file with each line preceded with a line number followed by a colon. The
line numbering should start at 1.
 */
package basic_practice_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P15_Line_Number_Display {

    public static void main(String[] args) {

        System.out.print("Enter the File Name :: ");
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();

        File file = new File(fName);

        if (!file.exists()) {
            System.out.println(fName + " Doesn't exists :(");
            System.exit(1);
        }

        try (Scanner output = new Scanner(file)) {
            int i = 1;
            while (output.hasNext()) {
                System.out.print(i + ": ");
                System.out.println(output.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
