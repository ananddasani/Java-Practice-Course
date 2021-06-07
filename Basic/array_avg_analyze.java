/*
QUESTION :: find the average of the numbers and find the numbers of the items greater than average
PRACTICE :: Array , Counting Skill
 */
package basic_package;

import java.util.Scanner;

public class array_avg_analyze {

    public static void main(String[] anand) {

        double sum = 0; // taking accumulator as basic_package.sum
        System.out.print("Enter the number of element you want to insert :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nenter the element : ");
            arr[i] = sc.nextDouble();
            sum += arr[i]; // adding the entered element in to the basic_package.sum everytime
        }

        double avg = sum / arr.length; // getting average

        int count = 0; // for counting the numbers which are greater than average
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg)
                count++;
        }

        System.out.println("\nAVERAGE IS :: " + avg + "\nnumbers greater than average is :: " + count);
    }
}
