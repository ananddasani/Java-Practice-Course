/*
(Sort students)
Write a program that prompts the user to enter the number of students,
the students’ names, and their scores, and prints student names in decreasing order of their scores.
 */
package basic_practice_package;

import java.util.Scanner;

public class P36_Student_Sort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students :: ");
        String[] students = new String[sc.nextInt()];
        int[] scores = new int[students.length];

        //take student name and scores
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter Student's name :: ");
            students[i] = sc.next();

            System.out.print("Enter " + students[i] + "'s marks :: ");
            scores[i] = sc.nextInt();
        }

        //sort in decreasing order
        sortDecrease(students, scores);

        //display the result
        for (String str : students)
            System.out.print(str + " \t");

    }

    public static void sortDecrease(String[] strs, int[] nums) {

        //sort the scores array
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int maxIndex = i;
            String temp;

            // Find the minimum in the list[i..nums.length - 1]
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                // Swap string array
                temp = strs[i];
                strs[i] = strs[maxIndex];
                strs[maxIndex] = temp;

                // Swap int array
                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
    }
}
