/*
(Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.
 */
package basic_practice_package;

import java.util.Scanner;

public class P12_Check_SubString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first String :: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string :: ");
        String s2 = sc.nextLine();

        //check for substring
        boolean flag = s1.contains(s2);

        if (flag)
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println("Not a subString :(");
    }
}
