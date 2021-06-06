/*
QUESTION :: take 3 numbers from user and print them in decreasing order
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class num_in_decreasing_order_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers :: "); // taking 3 numbers from user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.printf("\n\t\t\tYou entered\n%d %d %d\n", n1, n2, n3); // displaying what user has entered

        // using Math function
//        int max = Math.max(n1, Math.max(n2, n3)); // finding the max number using primitive Math function
//        int min = Math.min(n1, Math.min(n2, n3)); // finding the min number using primitive Math function

        // using user defined method
        int max = MAX(n1, n2, n3); // finding the max number using self made method
        int min = MIN(n1, n2, n3); // finding the min number using self made method

        int mid = (n1 + n2 + n3) - max - min; // calculating mid number
        System.out.printf("\t\tDecreasing order is\n%d %d %d\n", max, mid, min); // displaying in decreasing order
    }

    /**
     * this is a value returning method to find the maximum number from the 3 number passed as formal argument from main method
     *
     * @param n1 First number
     * @param n2 Second number
     * @param n3 Third number
     * @return the maximum of n1 , n2 , n3
     */
    public static int MAX(int n1, int n2, int n3) {
        int max;

        if (n1 > n2 && n1 > n3)
            max = n1;
        else if (n2 > n3)
            max = n2;
        else
            max = n3;

        return max; // returning the maximum number to the calling method
    }

    /**
     * this is a value returning method to find the minimum number from 3 number passed as formal argument from main method
     *
     * @param n1 First number
     * @param n2 Second number
     * @param n3 Third number
     * @return the minimum of n1 , n2 , n3
     */
    public static int MIN(int n1, int n2, int n3) {
        int min;

        if (n1 < n2 && n1 < n3)
            min = n1;
        else if (n2 < n3)
            min = n2;
        else
            min = n3;

        return min; // returning the minimum number to the calling method
    }
}