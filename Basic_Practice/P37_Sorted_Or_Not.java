/*
(Sorted?)
Write the following method that returns true if the list is already sorted in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether
the list is sorted or not. Here is a sample run. Note that the first number in the
input indicates the numb
 */
package basic_practice_package;

import java.util.Scanner;

public class P37_Sorted_Or_Not {

    public static void main(String[] args) {

        System.out.print("Enter the size of list :: ");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];

        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number :: ");
            arr[i] = sc.nextInt();

            //can't check i - 1 index if i = 0 so skip checking for once
            if (i == 0)
                continue;

            //if previous element is greater than current then list is not sorted :(
            if (arr[i - 1] > arr[i])
                isSorted = false;
        }

        //display the result
//        System.out.println(isSorted ? "\nList is sorted :)" : "\nList is NOT sorted :(");
        System.out.println("List is " + (isSorted ? "\b" : " NOT ") + " sorted ");
    }
}
