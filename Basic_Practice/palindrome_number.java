/*
program to check whether the number is palindrome or not
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class palindrome_number {

    public static void main(String[] args) {

        System.out.print("Enter the number to check it is palindrome or not :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (palindrome(n))
            System.out.println(n + " is a PALINDROME NUMBER");
        else
            System.out.println(n + " is not a PALINDROME NUMBER");
    }

    /**
     * this is a boolean returning method which will check the number passed as actual parameter form the main is palindrome or not
     * palindrome number means reversal of the number is same of the original number
     *
     * @param num will be checked
     * @return boolean value depending upon the number passed
     */
    public static boolean palindrome(int num) {

        int r, sum = 0, n = num;
        while (n != 0) { // reversing the number
            r = n % 10;
            sum = sum * 10 + r;
            n /= 10;
        }
        if (sum == num) // checking the reverse is same to original number
            return true;
        else
            return false;
    }
}
