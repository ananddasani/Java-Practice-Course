/*
program to count the number of digits in the given number
PRACTICE :: Basic Maths problem
 */
package basic_package;

import java.util.Scanner;

public class count_no_of_digit {

    public static void main(String[] args) {

        System.out.print("\nEnter the number to check how much digit it is containing :: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking the number form the user

        int count = 0, temp = n; // storing the number given by the user in the temp to display it later
        while (n != 0) { // running while until n becomes 0
            count++; // will count the number of digits appear
            n /= 10; // dividing n by 10 to get neglet the last digit which is already counted
        }
        System.out.println(temp + " having " + count + " digits :)");
    }
}
