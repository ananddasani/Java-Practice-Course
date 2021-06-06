/*
PRACTICE :: Methods basics
 */
package basic_package;

import java.util.Scanner;

public class method_max {

    public static void main(String[] args) {

        System.out.print("\nEnter two numbers :: ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("max of " + a + " and " + b + " is = " + max(a, b));
    }

    /**
     * the Max method will return the maximum of 2 number
     *
     * @param a is the first number
     * @param b is the second number
     * @return maximum of a and b
     */
    public static int max(int a, int b) {

        int m;
        return m = a > b ? a : b;
    }
}
