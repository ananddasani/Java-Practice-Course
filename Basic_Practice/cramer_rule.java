/*
Write a program that solves the following equation and displays the value x and y:

                            Assuming Cramer’s rule to solve equation
        ax+by=e x=ed-bf/ad-bc
        cx+dy=f y=af-ec/ad-bc

PRACTICE :: Basic Maths
*/
package basic_package;

import java.util.Scanner;

public class cramer_rule {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n\t\tENTER VALUE FOR EQUATION 1");

        System.out.print("Enter value of a :: ");
        float a = input.nextFloat();
        System.out.print("Enter value of b :: ");
        float b = input.nextFloat();
        System.out.print("Enter value of e :: ");
        float e = input.nextFloat();

        System.out.println("\n\t\tENTER VALUE FOR EQUATION 2");

        System.out.print("Enter value of c : ");
        float c = input.nextFloat();
        System.out.print("Enter value of d : ");
        float d = input.nextFloat();
        System.out.print("Enter value of f :: ");
        float f = input.nextFloat();
    }
}
