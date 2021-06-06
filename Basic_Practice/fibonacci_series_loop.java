/*
program to print the fibonacci series using loop
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class fibonacci_series_loop {

    public static void main(String[] args) {

        System.out.print("Enter the limit of fibonacci series :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 1, prev = 0, next;

        for (int i = 1; i <= n; i++) {
            next = prev + current;
            System.out.print(current + "    ");
            prev = current;
            current = next;
        }
    }
}
