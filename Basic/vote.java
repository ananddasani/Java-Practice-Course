/*
Program to Demonstrate the validation of user input
PRACTICE :: validation of data as per our need :)
 */
package basic_package;

import java.util.Scanner;

public class vote {

    public static void main(String[] args) {

        System.out.print("Enter your age :: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (VOTE(age))
            System.out.println("eligible for basic_package.vote");
        else
            System.out.println("not eligible for basic_package.vote");
    }

    public static boolean VOTE(int age) {
        if (age > 150 || age < 1) {
            System.out.println("invalid age :(");
            return false;
        } else if (age < 18)
            return false;
        else
            return true;
    }
}
