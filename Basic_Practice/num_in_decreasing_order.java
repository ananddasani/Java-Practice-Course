/*
QUESTION :: take 3 numbers from user and display them into decreasing order
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class num_in_decreasing_order {

    public static void main(String[] args) {

        int[] arrNum = new int[10]; // declaring basic_package.array

        Scanner ip = new Scanner(System.in);
        System.out.print("\nhow to many numbers you want to enter ? ");
        int n = ip.nextInt(); // taking number of input user want ot insert

        for (int j = 0; j < n; j++) {
            System.out.print("Enter element :: ");
            arrNum[j] = ip.nextInt(); // taking input form user and storing in the basic_package.array linearly
        }

        System.out.println("\n\t\t\tYOU ENTERED");
        for (int k = 0; k < n; k++) // displaying what user entered
            System.out.print(arrNum[k] + "    ");

        boolean swapped;
        for (int i = 0; i < n - 1; i++) { // running loop for passes (which is form 0 to n - 1)
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { // running the loop for comparison

                if (arrNum[j] > arrNum[j + 1]) { // if the next element is greater then the current element them basic_package.swap

                    int temp = arrNum[j];
                    arrNum[j] = arrNum[j + 1];
                    arrNum[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) // exiting the loop if basic_package.array is sorted , no need to iterate further
                break;
        }// basic_package.array is sorted in ascending order

        System.out.println("\n\t\tNUMBERS IN DECREASING ORDER");
        for (int k = n - 1; k >= 0; k--) //printing basic_package.array in descending order / reverse manner
            System.out.print(arrNum[k] + "    ");
    }
}