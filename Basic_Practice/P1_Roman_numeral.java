/*
1. Roman Numerals
Write a program that prompts the user to enter a number within the range of 1 through 10.
The program should display the Roman numeral version of that number. If the number is
outside the range of 1 through 10, the program should display an error message.
 */
package basic_practice_package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P1_Roman_numeral {

    public static void main(String[] args) {

        System.out.print("Enter any number in between 1 to 10 :: ");
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();

            switch (number) {
                case 1 -> System.out.println("I");
                case 2 -> System.out.println("II");
                case 3 -> System.out.println("III");
                case 4 -> System.out.println("IV");
                case 5 -> System.out.println("V");
                case 6 -> System.out.println("VI");
                case 7 -> System.out.println("VII");
                case 8 -> System.out.println("VII");
                case 9 -> System.out.println("IX");
                case 10 -> System.out.println("X");
                default -> System.out.println("Range is 1 - 10");
            }
        } catch (InputMismatchException e) {
            System.out.println("Only integer input is acceptable :)");
        }
    }
}
