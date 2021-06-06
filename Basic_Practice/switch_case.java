/*
program to demonstrate switch case , program will take a number from the user and print the corresponding day of the week
PRACTICE :: Basic switch case
 */
package basic_package;

import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {

        System.out.print("Enter the number of day :: ");

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        /*
        // TRADITIONAL SWITCH CASE
        switch (day) {
            case 1:
                System.out.println("\nsunday");
                break;
            case 2:
                System.out.println("\nMonday");
                break;
            case 3:
                System.out.println("\nTuesday");
                break;
            case 4:
                System.out.println("\nWednesday");
                break;
            case 5:
                System.out.println("\nThursday");
                break;
            case 6:
                System.out.println("\nFriday");
                break;
            case 7:
                System.out.println("\nsaturday");
                break;
            default:
                System.out.println("\nINVAID CHOICE");
        }
        */
        // ENHANCED SWITCH CASE
        switch (day) {
            case 1 -> System.out.println("\nSunday");
            case 2 -> System.out.println("\nMonday");
            case 3 -> System.out.println("\nTuesday");
            case 4 -> System.out.println("\nwednesday");
            case 5 -> System.out.println("\nThursday");
            case 6 -> System.out.println("\nFriday");
            case 7 -> System.out.println("\nSaturday");
            default -> System.out.println("\nINVAID CHOICE");
        }
    }
}

