/*
(Eliminate duplicates)
Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a test program that reads in ten integers, invokes the method, and displays
the result.
 */
package basic_practice_package;

import java.util.Scanner;

public class P35_Eliminate_Duplicates {

    public static void main(String[] args) {

        System.out.println("You have to input 10 integers ");

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number :: ");
            arr[i] = sc.nextInt();
        }

        //display the original array
        System.out.println("Original Array ");
        for (int ele : arr)
            System.out.print(ele + "\t");

        int[] finalArray = eliminateDuplicates(arr);

        //display final array
        System.out.println("\nDuplicates Eliminated ");
        for (int ele : finalArray) {
            if (ele > 0)
                System.out.print(ele + "\t");
        }
    }

    /**
     * Method will eliminate the duplicates appears in the original list and returns the distinct array
     *
     * @param list is the original array
     * @return the distinct array
     */
    public static int[] eliminateDuplicates(int[] list) {

        int[] distinctList = new int[list.length];
        int i = 0; // index

        for (int ele : list) {
            if (linearSearch(distinctList, ele) == -1) {
                distinctList[i] = ele;
                i++;
            }
        }
        return distinctList;
    }

    /**
     * Method will search for key and return the index if key is present else returns -1
     *
     * @param distinctList is the array to perform search
     * @param key          is the value which we are searching
     * @return index if key found else returns -1
     */
    public static int linearSearch(int[] distinctList, int key) {
        for (int i = 0; i < distinctList.length; i++) {
            if (key == distinctList[i])
                return i;
        }
        return -1;
    }
}
