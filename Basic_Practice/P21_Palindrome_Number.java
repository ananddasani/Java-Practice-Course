/*
(Palindrome integer)
Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome.
A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
 */
package basic_practice_package;

import java.util.Scanner;

public class P21_Palindrome_Number {

    public static void main(String[] args) {

        System.out.println("Enter an int to check whether it is palindrome or not :: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //reversing the number
        int revNum = reverse(num);

        if (isPlalindrome(num, revNum))
            System.out.println(num + " is Palindrome :)");
        else
            System.out.println(num + " is NOT Palindrome :)");
    }

    public static int reverse(int n) {
        int sum = 0;

        while (n != 0) {
            sum = (sum * 10) + (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static boolean isPlalindrome(int num, int revNum) {
        return num == revNum;
    }
}
