//Program for demonstrating how to close the file automatically by the use of try with resources
package basic_oop_pakage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class oop_19_try_with_resources {

    public static void main(String[] args) throws IOException {

        //Creating the file object
        File file = new File("Scores2.txt");

        if (file.exists()) {
            System.out.println("file already exists :(");
            System.exit(1);
        }

        //so now file will be closed automatically at the end
        try (
                // else create new file on the machine
                PrintWriter output = new PrintWriter("Scores2.txt");
        ) {
            // write formatted output to the file
            output.print("Anand ");
            output.println(60);

            output.print("Dasani ");
            output.println(60);
        } // here file will close
    }
}
