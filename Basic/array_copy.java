/*
Program to Demonstrate the arraycopy method in Java
NOTE :: this is a method which is breaking naming convection of java
(according to the camel case convection --> c must be 'C' in arraycopy method name :)     )
 */
package basic_package;

import java.util.Scanner;

public class array_copy {

    public static void main(String[] args) {

        System.out.print("Enter the length of the basic_package.array :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) { // taking the input in arr
            System.out.print("enter the element : ");
            arr[i] = sc.nextInt();
        }

        // printing arr
        System.out.println("You entered :");
        for (int ele : arr)
            System.out.print(ele + "    ");

        int brr[] = new int[arr.length];

        // method 1. copying arr into brr
//        for (int i = 0; i < n; i++)
//            brr[i] = arr[i];

        // method 2. copying arr into brr using arraycopy static method
        System.arraycopy(arr, 0, brr, 0, arr.length);

        // printing brr
        System.out.println("\n\n\t\tBRR\n");
        for (int ele : brr)
            System.out.print(ele + "    ");
    }
}
