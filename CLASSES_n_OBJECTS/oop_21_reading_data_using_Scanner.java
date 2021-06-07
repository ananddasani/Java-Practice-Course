//Program to read data form a file using Scanner class
package basic_oop_pakage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oop_21_reading_data_using_Scanner {

    public static void main(String[] args) {

        //for scanning input form the keyboard
        Scanner keyboard = new Scanner(System.in);

        //create an file instance
        File file = new File("Scores2.txt");

        //exit if not exists and also if it is null
        if (!file.exists() && file.length() == 0) {
            System.out.println("Unable to read, Check the file :(");
            System.exit(1);
        }

        //try-with-resources
        try (
                //crate a Scanner for file
                Scanner fl = new Scanner(file)
        ) {
            while (fl.hasNext()) {
                String firstName = fl.next();
                String middleName = fl.next();
                String lastName = fl.next();
                int score = fl.nextInt();

                //print the data
                System.out.println("\nFirst Name :: " + firstName + "\nMiddle Name :: " + middleName + "\nLast Name :: " + lastName + "\nScore :: " + score);
            }

//            //close the file
//            fl.close(); --> used try-with-resources, so file will be closed automatically

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
