/*
program to check the given number is prime or not
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {

        System.out.print("Enter the number to check whether it is prime or not :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (prime(n))
            System.out.println(n + " is a PRIME number");
        else
            System.out.println(n + " is not a PRIME number");
    }

    /**
     * this is a boolean returning method for checking the number passed as a actual parameter is prime or not
     * prime number means , number only having 2 divisor (1 and itself)
     *
     * @param num for checking
     * @return the boolean value depending on the number passed
     */
    public static boolean prime(int num) {

        int n = num, count = 1;

//        for (int i = 2; i <= n; i++) {
//            if (n % i == 0)
//                count++;
//        }
//        if (count == 2)
//            return true;
//        else
//            return false;

        // optimized way
        for (int i = 2; i < n / 2; i++) // either going till n - 1 simply go till n/2
            if (n % i == 0)
                return false;

        return true;
    }
}