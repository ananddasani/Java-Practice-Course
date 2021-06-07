/*
Write a method with following method header.
public static int gcd(int num1, int num2)
Write a program that prompts the user to enter two integers and compute the gcd of two integers.
 */
package Practical_package;

import java.util.Scanner;

public class PR_9_GCD {

    public static void main(String[] args) {

        System.out.print("Enter two integers to compute it's GCD :: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is :: " + gcd(num1, num2));

    }

    /**
     * Method for computing the GCD of given 2 numbers by the user
     *
     * @param n1 for holding the first number
     * @param n2 for holding the second number
     * @return the GCD of both the number passed
     */
    public static int gcd(int n1, int n2) {

        int gcd = 1; // initially the GCD is 1 for all the numbers
        int i = 2; //starting form 2 as gcd is 1 already assumed

        while (i <= n1 && i <= n2) {

            // //if number is divisible by both the numbers it means it is cd
            if ((n1 % i == 0) && (n2 % i == 0))
                gcd = i;
            i++;
        }
        return gcd;
    }
}