/*
(Check password)
Some websites impose certain rules for passwords.
Write a method that checks whether a string is a valid password.
Suppose the password rules are as follows:
 ■ A password must have at least eight characters.
 ■ A password consists of only letters and digits.
 ■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.
 */
package basic_practice_package;

import java.util.Scanner;

public class P24_Check_Password {

    public static void main(String[] args) {

        System.out.print("Enter Password :: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        //Rule 1; (check for at least 8 characters )
        if (password.length() < 8) {
            System.out.println("Password Too weak , Keep it at least of 8 characters :)");
            System.out.println("Invalid Password :(");
            System.exit(1);
        }

        char[] pass = password.toCharArray();
        int digitCount = 0;
        for (char c : pass) {
            //Rule 2; (Only Letters or Digits must be there )
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("Password can contain only Letters and Digits :)");
                System.exit(1);
            }

            //Rule 3; (must contain at least two digits )
            if (Character.isDigit(c))
                digitCount++;
        }

        if (digitCount < 2) {
            System.out.println("Password must contain at least 2 digits :(");
            System.out.println("Invalid Password :(");
        } else
            System.out.println("Strong and Valid Password :)");
    }
}
