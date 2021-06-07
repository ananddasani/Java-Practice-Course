//Program to practice all the methods of Strings we have learned so far :)
/*
QUESTION ::

WAP that displays the number of letters, digits, and whitespace characters in a string.
 */
package basic_package;

import java.util.Scanner;

public class methods_string_practice_all {

    public static void main(String[] args) {

        System.out.print("Enter any String to see the letters , digits and whitespaces it contains :: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int letters = 0; //count for letters
        int digits = 0; // count for digits
        int whitespace = 0; // count for whitespaces

        //converting String to character array
        char[] cArray = input.toCharArray();

        //calculate until the end of string
        for (int i = 0; i < cArray.length; i++) {

            //check for letter
            if (Character.isLetter(cArray[i]))
                letters++;

            //check for digit
            if (Character.isDigit(cArray[i]))
                digits++;

            //check for whitespaces
            if (Character.isWhitespace(cArray[i]))
                whitespace++;
        }
        System.out.println("The string contains " + letters + " letters , " + digits + " Digits and " + whitespace + " whitespaces :)");
    }
}
