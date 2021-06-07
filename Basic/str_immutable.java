/*
program to demonstrate the immutability of string by passing by reference (we can't change the value of string )
PRACTICE :: What is immutability of string
 */
package basic_package;

import java.util.Scanner;

public class str_immutable {

    public static void main(String[] args) {

        System.out.print("Enter any string :: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("You entered " + str);
        System.out.println("\t\t\ncalling the string value change method...");
        strChange(str);
        System.out.println("\nnow string is (form main):: " + str);
    }

    public static void strChange(String str) {
        System.out.println("\nchanging str content...(form strChange method) ");
        str = "dasani";
        System.out.println("string is changed to \"" + str + "\" (from strChange method)");
    }
}

/*
reference of string is passed to strChange method and string content is changed to dasani in the method
so now the string is dasani

but it will not affect to the main function though we have passed the reference of the string object
this shows that Strings in JAVA is immutable :)
 */
