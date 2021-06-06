/*
Program to Demonstrate boolean in Java
PRACTICE :: Boolean and Static methods of java
 */
package basic_package;

import java.util.Scanner;

public class bool_example {

    public static void main(String[] args) {

        System.out.print("\nenter the integer :: ");

        Scanner sc = new Scanner(System.in);
        boolean b = sc.hasNextInt(); // returns true or false
        System.out.println(b);
    }
}
