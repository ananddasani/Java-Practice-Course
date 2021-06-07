/*
program to calculate area of the circle whose radius is given by user
PRACTICE :: taking user input using Scanner class. And demonstrate final keyword in Java.
 */
package basic_package;

import java.util.Scanner;

public class area_circle_final {

    public static void main(String[] args) {

        // making the value of PI read only by using the keyword "final"
        final float PI = 3.14F;
        System.out.print("\nenter Radius: ");

        Scanner ip = new Scanner(System.in);
        int r = ip.nextInt();

        System.out.println("\narea of circle having radius " + r + " is :: " + (r * r * PI));
    }
}
