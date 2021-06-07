/*
Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the
numbers, display the numbers.
 */
package Practical_package;

import java.util.Scanner;

public class PR_10_Reverse_10_Numbers {

    public static void main(String[] args) {

        //taking all the ten numbers in an array
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number :: ");
            arr[i] = sc.nextInt();
        }

        //displaying before reversing
        System.out.print("you entered :: ");
        display(arr);

        reverse(arr); //Reversing....

        //displaying after reversing
        System.out.print("\nReverse is :: ");
        display(arr);
    }

    /**
     * Method to display ten number in original order the user entered
     *
     * @param arr is the array element
     */
    public static void display(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + "    ");
    }

    /**
     * Method for Reversing the numbers in array
     *
     * @param arr is the array element
     */
    public static void reverse(int[] arr) {

        int i = 0 , temp;

        //Running the loop for half of array
        while(i <= (arr.length / 2)) {

            //swapping the first and last numbers and so on... --> swap(i , (arr.length - 1 - i));
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 -i] = temp;

            i++;
        }
    }
}

/*
TEST CASE
Enter the number :: 1
Enter the number :: 2
Enter the number :: 3
Enter the number :: 4
Enter the number :: 5
Enter the number :: 6
Enter the number :: 7
Enter the number :: 8
Enter the number :: 9
Enter the number :: 10
you entered :: 1    2    3    4    5    6    7    8    9    10
Reverse is :: 10    9    8    7    5    6    4    3    2    1
 */
