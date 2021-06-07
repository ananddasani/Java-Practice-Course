/*
(Format an integer)
Write a method with the following header to format the integer with the specified width.
                    public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s.
The size of the string is the width.

For example, format(34, 4) returns 0034 and format(34, 5) returns 00034.
If the number is longer than the width, the method  returns the string representation for the number.

For example, format(34, 1) returns 34.

Write a test program that prompts the user to enter a number and its width and
displays a string returned by invoking format(number, width).
 */
package basic_practice_package;

import java.util.Scanner;

public class P28_Format_an_Integer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :: ");
        int number = sc.nextInt();
        System.out.print("Enter width :: ");
        int width = sc.nextInt();

        System.out.println(format(number, width));

    }

    public static String format(int num, int wid) {
        String number = num + "";

        //if the number is shorter than width format
        if (number.length() < wid) {
            for (int i = wid - number.length(); i > 0; i--)
                number = 0 + number;
        }
        //else return number as it  is
        return number;
    }
}
