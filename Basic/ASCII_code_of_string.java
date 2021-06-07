/*
QUESTION :: print the corresponding ASCII Code of the individual character of the string
PRACTICE :: common methods of String class
 */
package basic_package;

import java.util.Scanner;

public class ASCII_code_of_string {

    public static void main(String[] args) {

        System.out.print("Enter the string to view it's individual character's ASCII code :: ");
        Scanner sc = new Scanner(System.in); // taking the String form the user
        String str = sc.nextLine(); // using next.Line to consider the blank space

        for (int i = 0; i < str.length(); i++)
            System.out.println(str.charAt(i) + " = " + (int) str.charAt(i));
//            System.out.printf("%c = %d\n", str.charAt(i), (int) str.charAt(i));
    }
}