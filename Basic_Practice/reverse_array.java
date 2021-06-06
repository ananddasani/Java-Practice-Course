/*
Program to reverse the array using User-defined method
PRACTICE :: Basic Array , Methods , Loop
 */
package basic_package;
import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {

        System.out.print("Enter the size of basic_package.array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array : ");
        displayArray(arr);

        reverseArray(arr);

        System.out.println("\nReversed array : ");
        displayArray(arr);
    }

    /**
     * method will reverse the content of array
     *
     * @param arr for storing the array
     */
    public static void reverseArray(int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * method will print the basic_package.array
     *
     * @param arr for storing the basic_package.array
     */
    public static void displayArray(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + "    ");
    }
}
