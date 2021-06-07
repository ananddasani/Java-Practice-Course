package basic_package;// program to print prime numbers as many as user want

import java.util.Scanner;

public class prime_number_range {

    public static void main(String[] args) {

        System.out.print("How many prime numbers you want to see :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\nSThe first " + n + " prime numbers are :: ");

        int count = 0; // starting from and going till count - 1 in for loop
        for (int i = 2; count < n; i++) { // starting form i = 2 because no need to check for 1
            if (prime(i)) { // if i is prime than printing that number
                if (count % 10 == 0) // just printing 10 numbers in one line and giving \n if count is 10 completed and 11th
                    System.out.println();
                System.out.printf("%-5d", i);
                count++;
            }
        }
    }

    /**
     * this is a boolean returning method for checking the number passed as a actual parameter is prime or not
     * prime number means , number only having 2 divisor (1 and itself)
     *
     * @param n for checking
     * @return the boolean value depending on the number passed
     */
    public static boolean prime(int n) {

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) // if any number is divisible than it is not prime (because 1 is already neglected and not going till n so
                return false; // no number we will encounter that divide n if so than n not prime number

        return true;
    }
}
