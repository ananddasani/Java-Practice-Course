/*
(Strictly identical arrays)
The arrays list1 and list2 are strictly identical
if their corresponding elements are equal. Write a method that returns true if
list1 and list2 are strictly identical, using the following header:
public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and displays whether the two are strictly identical.
 */
package basic_practice_package;

import java.util.Scanner;

public class P38_Strictly_Identical_Arrays {

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

        for (int i = 0; i < list1.length; i++) {

            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
