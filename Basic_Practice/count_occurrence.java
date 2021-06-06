/*
(Count occurrence of numbers)
Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0.

Note that if a number occurs more than one time, the plural word “times” is used
in the output

PRACTICE :: Array , if-else , counting , continue Keyword
 */

package basic_package;

import java.util.Scanner;
public class count_occurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element in between 1 to 100 (0 to exit) ");
        int num = sc.nextInt(); // taking the input

        int[] count = new int[101]; // count will keep the record of the occurred element which user has inputted

        do {

            if (num <= 0 || num > 100) { //validating the input , break if input if invalid
                System.out.println("\nCounting number of occurrence of your input... ");
                break;
            } // initially the count basic_package.array having all the elements 0s
            ++count[num]; // go to the inputted element's index in the count basic_package.array and increase that index element by one
            System.out.print("enter next element : ");
            num = sc.nextInt(); // reading next input

        } while (num != 0);

        int ans;
        for (int i = 1; i < 101; i++) {
            ans = count[i]; // checking all the elements of count and printing it respectively

            if (ans == 0) // if any element in count basic_package.array is 0 means that number is not occurred
                continue;
            else if (ans == 1) // using "time" if occurred once
                System.out.println(i + " occurs " + ans + " time");
            else // using "times" if occurred more than one time
                System.out.println(i + " occurs " + ans + " times");
        }
    }
}