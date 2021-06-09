/*
(Computing gcd)
Write a method that returns the gcd of an unspecified number
of integers. The method header is specified as follows:
public static int gcd(int... numbers)

Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
 */
package basic_practice_package;

import java.util.Scanner;

public class P34_Computing_GCD {

    public static void main(String[] args) {

//        System.out.println("GCD :: " + gcd(1, 2, 3, 4, 5));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers :: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number :: ");
            arr[i] = sc.nextInt();
        }
    }

    /**
     * Method will return the gcd of unspecified number of integers
     *
     * @param numbers is the integer array to hold the numbers
     * @return gcd of all the numbers passes in the argument
     */
    public static int gcd(int... numbers) {
        //initially gcd be 1
        int gcd = 1;
        boolean isDivisor;

        for (int i = 2; i < min(numbers); i++) {
            isDivisor = true;

            for (int ele : numbers) {
                if (ele % i != 0)
                    isDivisor = false;
            }

            if (isDivisor)
                gcd = i;
        }
        return gcd;
    }

    /**
     * Method returns the minimum number form the array passes as param.
     *
     * @param num is the Array name
     * @return the min. number form the num
     */
    public static int min(int[] num) {
        int min = num[0];
        for (int e : num) {
            if (e < min)
                min = e;
        }
        return min;
    }
}
