/*
program to calculate area of rectangle by taking data with use of various functions
PRACTICE :: Methods , (Getter and Setter)
 */
package basic_package;

import java.util.Scanner;

public class area_rectangle {

    public static void main(String[] args) {

        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
    }

    /**
     * method to get length of rectangle form user
     *
     * @return the value of length which user has given
     */
    public static double getLength() {

        System.out.print("\nEnter the length of rectangle :: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();

        return length;
    }

    /**
     * method to get width of rectangle from user
     *
     * @return the value of width which user has given
     */
    public static double getWidth() {

        System.out.print("\nEnter the width of rectangle :: ");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();

        return width;
    }

    /**
     * method to calculate area of rectangle
     *
     * @param length for storing length value
     * @param width  for storing width value
     * @return area by multiplying length and width which is passed as parameter
     */
    public static double getArea(double length, double width) {
        return length * width;
    }

    /**
     * method to print all data
     *
     * @param length for storing length value
     * @param width  for storing width value
     * @param area   for storing area of rectangle
     */
    public static void displayData(double length, double width, double area) {
        System.out.println("length = " + length + "\twidth = " + width + "\tarea = " + area);
    }
}
