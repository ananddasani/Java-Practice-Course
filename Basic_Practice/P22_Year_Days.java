/*
(Number of days in a year)
Write a method that returns the number of days in a year using the following header:
                    public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2000 to 2020
 */
package basic_practice_package;

import java.util.Scanner;

public class P22_Year_Days {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Here are number of days in year 2000 - 2020");
        System.out.print("Enter the starting Year :: ");
        int sYear = sc.nextInt();
        System.out.print("Enter the ending year :: ");
        int eYear = sc.nextInt();

        int gap = eYear - sYear;
        for (int i = 0; i <= gap; i++) {
            System.out.println(sYear + " : " + numberOfDays(sYear) + " Days");
            sYear++;
        }
    }

    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        return false;
    }

    public static int numberOfDays(int year) {
        if (isLeap(year))
            return 366;
        return 365;
    }
}
