/*
Write a program that reads a number in meters, converts it to feet, and displays the result.
 */
package Practical_package;

import java.util.Scanner;

public class PR_3_Conversion {

    public static void main(String[] args) {

        while (true) {

            System.out.print("\nEnter the distance in meter :: ");
            Scanner sc = new Scanner(System.in);
            double meters = sc.nextDouble();

            System.out.println("\n1. convert to kilometers \n2. convert to inches \n3. convert to feet \n4. exit");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();

            if (ch != 4)
                System.out.print("\n" + meters + " meters = ");
            switch (ch) {
                case 1 -> {
                    double kilometers = toKilo(meters);
                    System.out.println(kilometers + " kilometers");
                }
                case 2 -> {
                    double inches = toInches(meters);
                    System.out.println(inches + " inches");
                }
                case 3 -> {
                    double feet = toFeet(meters);
                    System.out.println(feet + " feet");
                }
                case 4 -> {
                    System.out.println("\nexiting...");
                    System.exit(0);
                }

                default -> System.out.println("invalid choice :(");
            }

            System.out.print("\nDo you continue Y/N ? ");
            String answer = sc.next();
            char ans = answer.charAt(0);

            if (ans == 'n' || ans == 'N') {
                System.out.println("\nHave a good day :)");
                break;
            }
        }
    }

    /**
     * method will take meter as argument and calculate the corresponding  kilometers
     *
     * @param meters for storing meters value
     * @return kilometers
     */
    public static double toKilo(double meters) {
        return meters * 0.001;
    }

    /**
     * method will take meter as argument and calculate the corresponding  inches
     *
     * @param meters for storing meters value
     * @return inches
     */
    public static double toInches(double meters) {
        return meters * 39.37;
    }

    /**
     * method will take meters as argument and calculate the corresponding feet
     *
     * @param meters for storing meters value
     * @return feet
     */
    public static double toFeet(double meters) {
        return meters * 3.281;
    }

}
