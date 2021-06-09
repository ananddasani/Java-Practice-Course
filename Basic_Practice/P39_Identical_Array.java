/*
(Identical arrays)
The arrays list1 and list2 are identical if they have the same contents.
Write a method that returns true if list1 and list2 are identical, using the following header:
                        public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical.
 */
package basic_practice_package;

import java.util.Scanner;

public class P39_Identical_Array {

    public static void main(String[] args) {

        System.out.print("Enter the length of List :: ");
        Scanner sc = new Scanner(System.in);
        int[] list1 = new int[sc.nextInt()];
        int[] list2 = new int[list1.length];

        //take data of list 1
        System.out.println("\n\t\tLIST 1\n");
        for (int i = 0; i < list1.length; i++) {
            System.out.print("Enter element :: ");
            list1[i] = sc.nextInt();
        }

        //take data of list 2
        System.out.println("\n\t\tLIST 2\n");
        for (int i = 0; i < list2.length; i++) {
            System.out.print("Enter element :: ");
            list2[i] = sc.nextInt();
        }

        //display both the lists
        System.out.println("\n\t\tYou Entered:\n");
        for (int ele : list1) {
            System.out.print(ele + "\t");
        }

        System.out.println();
        for (int ele : list2) {
            System.out.print(ele + "\t");
        }

        System.out.println(equals(list1, list2) ? "\nList are Strictly identical " : "\nList are not Strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        // Sort both lists in same order
        sort(list1);
        sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}