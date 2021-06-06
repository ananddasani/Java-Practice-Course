/*
program to demonstrate the if else statement by taking the age of the user and checking if he is eligible for voting or not
PRACTICE :: if-else
 */
package basic_package;
import java.util.Scanner;

public class condition_example {

    public static void main(String[] args){

        System.out.print("\nEnter your age :: ");
        Scanner sc = new Scanner(System.in); // taking the age of the user
        int age = sc.nextInt();

        if(age >= 18) // checking if the age is greater than 18 then print the message for eligible
            System.out.println("\nEligible for basic_package.vote :)");
        else // if age is not grater than 18 then not eligible to basic_package.vote
            System.out.println("\nNot eligible for basic_package.vote :(bbb");
    }
}
