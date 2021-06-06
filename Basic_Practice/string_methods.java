/*
Program to demonstrate the string class method
PRACTICE :: Some of the commonly used string methods in java
*/
package basic_package;

import java.util.Scanner;

public class string_methods {
    /**
     * the main method is a program starting point
     */
    public static void main(String[] args) {

        System.out.print("\nenter any string :: ");

        Scanner sc = new Scanner(System.in); // creating the scanner object
        String s = sc.nextLine(); // taking the input as string from the user , using ".nextLine()" which will consider the white space also
        String s1 = "anand";

        int strLen = s.length(); // calling the length function which will return the length of the string given by the user in integer
        System.out.println("size of \"" + s + "\" is :: " + strLen); // printing the length returned by the length function

        char cAt = s.charAt(0); // function will return the character present at the specified position
        System.out.println("character at specific index is :: " + cAt); // printing the character returned by the function

        String toLower = s.toLowerCase(); // function will return the string converted  into lower case
        System.out.println("lower case of \"" + s + "\" is :: " + toLower); // printing the lower cased string returned by the above function

        String toUpper = s.toUpperCase(); // function will convert the string into upper case
        System.out.println("upper case of \"" + s + "\" is :: " + toUpper); // printing the upper case string returned by the above function

        String name = s1.trim(); // function will removes the leading and tailing white space
        System.out.println("trimmed string is :: " + name);

        System.out.println("substring :: " + name.substring(2)); // return the string starting form the specified index
        System.out.println("substring :: " + name.substring(2, 4)); // returns the string from specified start to specified end (end is excluded)

        System.out.println("replace :: " + name.replace('a', 'n')); // replace the old char with new char
        System.out.println("replace :: " + name.replace("an", "AN")); // replace the old string with new string (every occurrence)

        System.out.println("start with :: " + s.startsWith("an")); // checks whether name starts with with an then return true
        System.out.println("start with :: " + s.endsWith("an")); // checks whether name starts with with an then return true

        System.out.println("index :: " + name.indexOf("a")); // returns the index of the specified string if present else -1
        System.out.println("index :: " + name.indexOf("an", 2)); // starts scanning from the given index

        System.out.println("index :: " + name.lastIndexOf("d")); // return the last occurrence of given string
        System.out.println("index :: " + name.lastIndexOf("d", 2)); // return the last occurrence of given string before the index given

        System.out.println("Equal or not :: " + s.equals("ANAND")); // checks whether the user inputted string is equal to the string or not (case sensitive)
        System.out.println("Equal or not :: " + s.equalsIgnoreCase("ANAND")); // case in-sensitive
    }
}
