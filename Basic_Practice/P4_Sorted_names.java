/*
7. Sorted Names
Write a program that asks the user to enter three names, and then displays the names sorted in ascending order.
For example, if the user entered “Charlie”, “Leslie”, and “Andy”, the
program would display:
Andy
Charlie
Leslie
 */
package basic_practice_package;

import java.util.Scanner;

public class P4_Sorted_names {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //take the names in an array
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name #" + (i + 1) + " :: ");
            names[i] = sc.next();
        }

        //display the original order of array names
        System.out.println("\nBefore sorting ");
        for (String s : names)
            System.out.print(s + "   ");


        //sort the array by default method (sort) of array class
//        Arrays.sort(names);

        //sorting array by the user defined logic
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {

                //if order is not correct then it will return 1
                if (names[i].compareTo(names[j]) > 0) {
                    //swap the names
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting");
        for (String s : names)
            System.out.print(s + "   ");
    }
}
