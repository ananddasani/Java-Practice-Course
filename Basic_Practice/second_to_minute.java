/*
QUESTION ::  convert second into minutes
PRACTICE :: Basic Maths
 */
package basic_package;
import java.util.Scanner;

public class second_to_minute {

    public static void main(String[] args) {

        System.out.print("\nenter the second to convert onto minute :: ");

        Scanner ip = new Scanner(System.in); // creating the scanner instance using the keyword "new"
        int second = ip.nextInt(); // getting seconds from the user

        int minute = second / 60; // converting the second into minute
        int remainingMinute = second % 60; // calculating the remaining seconds

        System.out.println("\n" + second + " seconds = " + minute + " minute & " + remainingMinute + " second");
    }
}
