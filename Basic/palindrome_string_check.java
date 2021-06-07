/*
Program to check whether the given string is palindrome or not
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class palindrome_string_check {

    public static void main(String[] args) {

        System.out.print("Enter the string :: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // this will not allow the user to enter the blank spaces

        if (isPalindrome(str))
            System.out.println(str + " is Palindrome :)");
        else
            System.out.println(str + " is not Palindrome :(");
    }

    /**
     * Method for checking the string is palindrome or not
     *
     * @param str is the string variable
     * @return true if string is palindrome else returns false
     */
    public static boolean isPalindrome(String str) {

        //i is counter variable , start is starting index and end is ending index
        for (int i = 0, start = 0, end = str.length() - 1; i <= (str.length() / 2); i++) {

            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else
                return false; // if start and end is not equal means string is not equal
        }
        return true; //if reached here means string is palindrome
    }
}
