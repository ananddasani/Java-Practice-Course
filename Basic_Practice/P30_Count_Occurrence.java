/*
(Count occurrence of numbers)
Write a program that reads the integers between 1 and 100
and counts the occurrences of each. Assume the input ends with 0.
 */
package basic_practice_package;

import java.util.Scanner;

public class P30_Count_Occurrence {

    public static void main(String[] args) {

        System.out.println("Enter number form 1 to 100");
        System.out.println("Enter 0 to end reading ");

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101]; //initially array contain 0 at all index

        int input;
        do {
            System.out.print("Enter number  :: ");
            input = sc.nextInt();

            if (input >= 1 && input <= 100)
                arr[input - 1]++;

        } while (input != 0);

        //display occurrence of numbers
        for (int i = 0; i < arr.length; i++) {
            //don't print that index whose content is 0;
            if (arr[i] > 0)
                System.out.println((i + 1) + " occurred " + arr[i] + " time" + (arr[i] > 1 ? "s" : ""));
        }
    }
}
