/*
(Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid.
 */
package basic_practice_package;

import java.util.Scanner;

public class P11_SSN_Number_Validation {

    public static void main(String[] args) {

        System.out.print("Enter your SSN number (format DDD-DD-DDDD):: ");
        Scanner sc = new Scanner(System.in);
        String ssn = sc.nextLine();

        char[] SSN = ssn.toCharArray();

        if (checkForSSN(SSN))
            System.out.println("Your SSN number is valid :)");
        else
            System.out.println("Your SSN number is invalid :(");
    }

    public static boolean checkForSSN(char[] SSN) {
        //check for the length first
        if (SSN.length != 11) {
            System.out.println("SSN number is too short :(");
            return false;
        }

        int i = 0;
        while (i < 11) {
            //check for delimiter where ever needed :)
            if (i == 3 || i == 6) {
                if (SSN[i] != '-') {
                    System.out.println(SSN[i] + " must be (-) delimiter :)");
                    return false;
                }
            } else { //else check for digit every time
                if (!Character.isDigit(SSN[i])) {
                    System.out.println(SSN[i] + " must be digit :)");
                    return false;
                }
            }
            i++;
        }
        //if reached here means number is valid
        return true;
    }
}
