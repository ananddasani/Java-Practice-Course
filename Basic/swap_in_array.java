/*
program will demonstrate pass by reference when basic_package.array is passed as a argument in method
PRACTICE :: Basic Maths and Array
 */
package basic_package;

import java.util.Scanner;

public class swap_in_array {

    public static void main(String[] args) {

        System.out.print("Enter the size of the basic_package.array :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        // printing basic_package.array before basic_package.swap
        System.out.println("You entered : ");
        for (int ele : arr)
            System.out.print((ele) + "    ");

        // printing the basic_package.array after basic_package.swap
        System.out.println("\n\t\tArray after swapped :");
        swap(arr, 0, n - 1);
        for (int ele : arr)
            System.out.print((ele) + "    ");
    }

    /**
     * method will basic_package.swap the two element of basic_package.array
     *
     * @param arr for the reference of the basic_package.array
     * @param a  for storing the first index
     * @param b   for storing second index
     */
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
