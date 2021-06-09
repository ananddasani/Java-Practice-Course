/*
(Reverse the numbers entered)
 Write a program that reads ten integers and displays them in the reverse of the order in which they were read.
 */
package basic_practice_package;

import java.util.Scanner;

public class P29_Reverse_Reading {

    public static void main(String[] args) {

        System.out.println("You have to enter 10 integers");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number :: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse order of 10 integers ::");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "    ");
        }
    }
}
