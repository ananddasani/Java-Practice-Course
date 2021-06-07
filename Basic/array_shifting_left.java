/*
QUESTION :: left shit the element of the array by one
PRACTICE :: Rotation of Array
 */
package basic_package;

import java.util.Scanner;

public class array_shifting_left {

    public static void main(String[] args) {

        System.out.print("Enter the size of the basic_package.array :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered :\n");
        printArray(arr, n);

        char ch;
        do {
            shift_left(arr, n);
            printArray(arr, n);

            System.out.print("\nDo you want to continue Y/N ? ");
            String ans = sc.next();
            ch = ans.charAt(0);
            System.out.println("ch :: " + ch);
            System.out.println("exiting...");
        } while (ch == 'y' || ch == 'Y');
    }

    /**
     * method to left the element of the basic_package.array by one position
     *
     * @param arr for storing the reference of the basic_package.array
     * @param n   is the size of the basic_package.array
     */
    public static void shift_left(int arr[], int n) {
        int i, temp = arr[0];
        for (i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    /**
     * method to print the basic_package.array
     *
     * @param arr for storing the reference of the basic_package.array
     * @param n   is the size of the basic_package.array
     */
    public static void printArray(int arr[], int n) {
        for (int ele : arr)
            System.out.print(ele + "    ");
    }
}
