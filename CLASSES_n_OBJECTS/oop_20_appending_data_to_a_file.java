//Program to demonstrate how to append data to a file
package basic_oop_pakage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class oop_20_appending_data_to_a_file {

    public static void main(String[] args) {

        try {
            //creating an instance of file class
            File file = new File("Scores.txt");

            //if not exists then create one
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Created new file :)");
            }

            //creating instance of fileWriter class and passing boolean true to append the data
            FileWriter fileWriter = new FileWriter("Scores.txt",true);

            //creating instance of PrintWriter class and giving the file to which data is to be appended
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print("Hetavi ");
            printWriter.println(90);

            printWriter.print("Dasani ");
            printWriter.println(80);

            //don't forget to close either the file will not be saved
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Successful :)");
    }
}
