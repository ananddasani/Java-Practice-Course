//Program to practice the substring methods founding provided by java
/*
QUESTION

The program searches an array of strings for an PERSON that starts
with a specified NAME.
 */
package basic_package;

import java.util.Scanner;

public class methods_string_substring_founding_practice {

    public static void main(String[] args) {

        //crate an array of names
        String[] people = {
                "Anand Dasani", "Hetavi Dasani",
                "Meet Patel", "Om Tiwari"
        };

        Scanner sc = new Scanner(System.in);

        //get a partial name to search
        System.out.print("Enter the last name of person you are looking for :: ");
        String lookup = sc.nextLine();

        //Display all the names which begins with the lookup target given by the user
        System.out.println("Here are the names that matches :)");
        for (String names : people) {
            if (names.endsWith(lookup))
                System.out.println(names);
        }
    }
}
