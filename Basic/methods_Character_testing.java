//Program to demonstrate several common method for test of character
package basic_package;

import java.util.Scanner;

public class methods_Character_testing {

    public static void main(String[] args) {

        String input; //getting input form the user
        char ch; //for holding one character for testing purpose
        String answer; //for asking the user to continue
        char ans; //for holding the first character (y or n)
        boolean continueInput = true;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Enter any String to test :: ");
            input = sc.nextLine();
            ch = input.charAt(0);

            //using Character wrapper class for testing the ch
            if (Character.isDigit(ch))
                System.out.println("That is a digit :)");

            if (Character.isLetter(ch))
                System.out.println("That is a letter :)");

            if (Character.isLetterOrDigit(ch))
                System.out.println("that is letter or digit :)");

            if (Character.isLowerCase(ch))
                System.out.println("That is a lower case ");

            if (Character.isUpperCase(ch))
                System.out.println("That is a upper case ");

            if (Character.isSpaceChar(ch))
                System.out.println("That is a space character ");

            if (Character.isWhitespace(ch))
                System.out.println("that is a tab or a new line character ");

            continueInput = false;

            //asking user whether he wants to continue
            System.out.print("Do you want to continue ? y/n ");
            answer = sc.nextLine();
            ans = answer.charAt(0); //getting first char y or n

            if (Character.toLowerCase(ans) == 'y')
                continueInput = true;

        } while (continueInput);
    }
}
