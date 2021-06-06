/*
QUESTION :: Implement Binary Search Algorithm without using Recursion
PRACTICE :: Sorting Algo.
 */
package basic_package;

import java.util.Scanner;

public class binary_search {

    public static void main(String[] args) {

        System.out.print("Enter the size of basic_package.array :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the element in sorted order : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\tYou entered : ");
        printArray(arr);

        System.out.print("\nEnter the element you want to search in the basic_package.array :: ");
        int key = sc.nextInt();

        int ans = binarySearch(arr, n, key);
        if (ans == -1)
            System.out.println("\n\t" + key + " Not present in the basic_package.array :(");
        else
            System.out.println("\n\t" + key + " Present in the basic_package.array :) ");
        printArray(arr);
    }

    public static int binarySearch(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;
        boolean found = false;

        int i;
        for (i = 0; i < n && !found; i++) {

            int mid = (low + high) / 2;

            if (key == arr[mid])
                found = true;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        if (!found)
            return -1;
        else
            return i;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + "   ");
    }
}
