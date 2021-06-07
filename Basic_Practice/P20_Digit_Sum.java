/*
(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit. For instance,
to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
(= 23). Use a loop to repeatedly extract and remove the digit until all the digits
are extracted. Write a test program that prompts the user to enter an integer and
displays the sum of all its digits.
 */
package basic_practice_package;

import java.util.Scanner;

public class P20_Digit_Sum {

    public static void main(String[] args) {

        System.out.println("Enter Number to get it's digit's sum :: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num + " --> " + sumDigit(num));
    }

    public static int sumDigit(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
