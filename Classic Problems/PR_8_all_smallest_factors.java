/*
Write a program that reads an integer and displays all its smallest factors in increasing order. For
example if input number is 120, the output should be as follows:2,2,2,3,5.
 */
package Practical_package;

import java.util.Scanner;

public class PR_8_all_smallest_factors {

    public static void main(String[] args) {

        System.out.print("Enter the number to see it's smallest factors in increasing order :: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("Factors of " + num + " is :: ");

        int n = num; // storing the original number
        int divisible = 2; //starting form 2

        while (n > 1) {

            if (n % divisible == 0) {
                System.out.print(divisible + ", ");
                n = n / divisible; //keep finding factors
            } else // else go for next number
                divisible++;
        }
        System.out.print("\b\b"); //Removing the last comma which is meaninglessly printing :)
    }
}

/*
TEST CASE

Enter the number to see it's smallest factors in increasing order :: 120
Factors of 120 is :: 2, 2, 2, 3, 5
 */
