/*
3. Time Calculator
Write a program that asks the user to enter a number of seconds.

•	 There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60,
the program should display the number of minutes in that many seconds.
•	 There are 3,600 seconds in an hour. If the number of seconds entered by the user is
greater than or equal to 3,600, the program should display the number of hours in
that many seconds.
•	 There are 86,400 seconds in a day. If the number of seconds entered by the user is
greater than or equal to 86,400, the program should display the number of days in
that many seconds.
 */
package basic_practice_package;

import java.util.Scanner;

public class P3_Time_Calculator {

    public static void main(String[] args) {

        System.out.print("Enter the seconds to calculate time in minutes/hours/days :: ");
        Scanner sc = new Scanner(System.in);
        double seconds = sc.nextDouble();

        if (seconds > 86400) {
            //it's an day so calculate !!
            double day = seconds / 86400;
            System.out.println("It's almost " + day + " Days :)");
        } else if (seconds > 3600) {
            //it's an hour so calculate !!
            double hours = seconds / 3600;
            System.out.println("It's almost " + hours + " Hours :)");
        } else if (seconds > 60) {
            //it's an minute so calculate !!
            double minutes = seconds / 60;
            System.out.println("It's almost " + minutes + " Minutes :)");
        } else
            System.out.println("It's " + seconds + " Seconds :)");
    }
}
