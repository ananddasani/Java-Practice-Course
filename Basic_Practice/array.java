/*
program to Demonstrate Arrays in Java
PRACTICE :: Array (Declaring , Assigning , ... )
 */
package basic_package;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        System.out.print("Enter the size of array :: ");
        Scanner sc = new Scanner(System.in); // taking the number of times the uer want ot input
        int n = sc.nextInt();
//        int[] arr = new int[n]; // declaring the basic_package.array and basic_package.array size
        int arr[] = new int[n]; // this is also valid

        for (int i = 0; i < n; i++) { // running loop from starting index 0 to n - 1
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt(); // storing the input given by user in basic_package.array
        }

        // displaying the basic_package.array using for loop (traditional way)
        System.out.println("\t\tUSING FOR LOOP");
        for (int i = 0; i < n; i++) // displaying the basic_package.array
            System.out.print(arr[i] + "    ");

        System.out.print("\n");

        // displaying the basic_package.array using for-each loop
        System.out.println("\t\tUSING FOR-EACH LOOP");
        for (int ele : arr)
            System.out.print(ele + "    ");
        // when we want the value of i or working with index , then there is no use of for each loop , it just print basic_package.array element
    }
}