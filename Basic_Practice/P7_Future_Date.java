/*
(Find future dates)
Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6).
Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */
package basic_practice_package;

import java.util.Scanner;

public class P7_Future_Date {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's day of week :: ");
        int todayDay = sc.nextInt();

        System.out.print("Enter the number of days elapsed since today :: ");
        int elapsedDay = sc.nextInt();

        //for finding today
        String today;
        switch (todayDay) {
            case 0 -> today = "Sunday";
            case 1 -> today = "Monday";
            case 2 -> today = "Tuesday";
            case 3 -> today = "Wednesday";
            case 4 -> today = "Thursday";
            case 5 -> today = "Friday";
            case 6 -> today = "Saturday";
            default -> today = null;
        }
        //for finding future day
        String futureDay;
        switch ((todayDay + elapsedDay) % 7) {
            case 0 -> futureDay = "Sunday";
            case 1 -> futureDay = "Monday";
            case 2 -> futureDay = "Tuesday";
            case 3 -> futureDay = "Wednesday";
            case 4 -> futureDay = "Thursday";
            case 5 -> futureDay = "Friday";
            case 6 -> futureDay = "Saturday";
            default -> futureDay = null;
        }
        //display the result
        System.out.println("Today is " + today + " And future day is " + futureDay);
    }
}
