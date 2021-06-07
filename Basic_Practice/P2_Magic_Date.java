/*
2. Magic Dates
The date June 10, 1960, is special because when we write it in the following format,
                                            6/10/60
the month times the day equals the year:

Write a program that asks the user to enter a month (in numeric form), a day, and a two digit year.
The program should then determine whether the month times the day is equal
to the year. If so, it should display a message saying the date is magic. Otherwise, it should
display a message saying the date is not magic.
 */
package basic_practice_package;

import java.util.Scanner;

public class P2_Magic_Date {

    public static void main(String[] args) {

        System.out.print("Enter Date Ex.(11/08/01) :: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next(); //space is not acceptable

        //validate the date
        if (date.length() != 8) {
            System.out.println("Date is too sort for moving on :(");
            System.exit(1);
        }

        //split the string with delimiter /
        String[] DT = date.split("/");

        //Extracting day , month and year
        int day = Integer.valueOf(DT[0]);
        int month = Integer.valueOf(DT[1]);
        int year = Integer.valueOf(DT[2]);

        //calculating the magic date
        if ((month * day) == year)
            System.out.println("Magic Date :)");
        else
            System.out.println("Not a Magic Date :(");
    }
}
