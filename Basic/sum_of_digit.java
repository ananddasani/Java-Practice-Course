/*
QUESTION :: print the sum of the digits in the number given by the user
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class sum_of_digit {

    public static void main(String[] args) {

        System.out.print("\nEnter the number to know the basic_package.sum of it's digit :: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, r, temp = n; // r for storing the reminder of the n (last digit of the number everytime)
        while (n != 0) {
            sum += (n % 10); //seperating the last digit of the number && then adding the last number to the basic_package.sum
            n /= 10; // removing the last digit of the number
        }
        System.out.println("\nSum of " + temp + " is -> " + sum);
    }
}
