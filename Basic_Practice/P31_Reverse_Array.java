/*
(Reverse an array)
reverses an array by copying it to a new array.
Rewrite the method that reverses the array passed in the argument and returns this array.
Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers,
and displays the numbers.
 */
package basic_practice_package;

import java.util.Scanner;

public class P31_Reverse_Array {

    public static void main(String[] args) {

        System.out.println("You have to enter 10 numbers ");
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number :: ");
            arr[i] = sc.nextInt();
        }

        //display the original array
        System.out.println("Original Array");
        for (int ele : arr)
            System.out.print(ele + "\t");

        int revArr[] = new int[arr.length];
        reverseArray(arr, revArr);

        //display the reversed array
        System.out.println("\nReversed Array");
        for (int ele : revArr)
            System.out.print(ele + "\t");
    }

    public static void reverseArray(int[] arr, int[] revArr) {
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            revArr[i] = arr[j];
        }
    }
}
