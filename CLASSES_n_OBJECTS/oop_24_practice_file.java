/*
QUESTION 1

Write code that does the following: opens a file named NumberList.txt, uses a loop
to write the numbers 1 through 100 to the file, and then closes the file.

QUESTION 2

Write code that does the following: opens the NumberList.txt file that was created
by the code in Question 1, reads all of the numbers from the file and displays them,
and then closes the file.

QUESTION 3

Modify the code you wrote in Question 2 so it adds all of the numbers read from
the file and displays their total.
 */
package basic_oop_pakage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oop_24_practice_file {

    public static void main(String[] args) {

        //create a file instance
        File file = new File("NumberList24.txt");

        if (!file.exists()) {
            System.out.println("File :: " + file + " not exists :(");
            System.exit(1);
        }

        //outer try for creating file and writing data
        try {
            PrintWriter write = new PrintWriter(file);

            //writing data using loop
            for (int i = 1; i <= 100; i++)
                write.println(i);

            //close write here to save data to a file (so that we can begin with scanning that data)
            write.close();


            //now scanning data from file and displaying
            Scanner outputData = new Scanner(file);

            /*
            //simple displaying data as per question 2
            while (outputData.hasNext()) {
                System.out.println(outputData.nextInt());
            }
            */

            //displaying sum of all data read, as per question 3
            double sum = 0.0;
            while (outputData.hasNext()) {
                sum += outputData.nextInt();
            }
            System.out.println("Sum --> " + sum);

            outputData.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
