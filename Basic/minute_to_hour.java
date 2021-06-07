/*
QUESTION ::  convert hour into minute
PRACTICE :: Basic Maths
 */
package basic_package;
import java.util.Scanner;

public class minute_to_hour {

    public static void main(String[] args) {

        System.out.print("\nenter the minute to convert into hours :: ");

        Scanner ip = new Scanner(System.in);
        int minute = ip.nextInt(); // getting minutes from user
        int hour = minute / 60; // converting it into hour
        int remainingHour = minute % 60; // calculating the remaining minutes

        System.out.println("\n" + minute + " minute = " + hour + " hour & " + remainingHour + " minutes ");
    }
}
