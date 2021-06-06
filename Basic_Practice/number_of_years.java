/*
QUESTION  :: convert minutes into years
PRACTICE :: Basic Maths
 */
package basic_package;
import java.util.Scanner;

public class number_of_years {

    public static void main(String[] args) {

        System.out.print("\nenter the minutes to know the years :: ");

        Scanner sc = new Scanner(System.in);
        long minutes = sc.nextLong();  // taking the minutes from the user

        long days = minutes / 1440L; // converting minutes into days (1 day have 1440 minutes)
        long years = days / 365L; // converting days into years (1 year have 365 days) , ignoring the leap year
        long remainingDays = days % 365L; // calculating the remaining days

        System.out.println("\n" + minutes + " = (approx) " + years + " years & " + remainingDays + " days");
    }
}
