/*
(Print distinct numbers)
Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an basic_package.array if it is new. If the number is already in the
basic_package.array, ignore it.) After the input, the basic_package.array contains the distinct numbers. Here is
the sample run of the program:
 */
package basic_package;

import java.util.Scanner;

public class print_distinct_numbers {

    public static void main(String[] args) {

        int[] arr = new int[10]; //for taking 10 input
        Scanner sc = new Scanner(System.in);
        int num, count = 0;
        boolean duplicate = false;

        for (int i = 0; i < 10; i++) {
            System.out.print("enter number : ");
            num = sc.nextInt();

            for (int j = 0; j < i; j++) // traversing the filled basic_package.array
                if (arr[j] == num) // if number is already present then no need to enter the current number in the basic_package.array
                    duplicate = true;

            if (duplicate) // if duplicate then ignore the rest of code
                continue;

            arr[i] = num; // if number is new than enter it into the basic_package.array
            count++; // counting the distinct numbers
        }

        System.out.println("Array contains " + count + " distinct numbers ");
        for (int i = 0; i < arr[i]; i++)
            System.out.print(arr[i] + "    ");
    }
}
