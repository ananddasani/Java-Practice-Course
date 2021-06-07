/*
Write a program that solves the following equation and displays the value x and y:
1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation
 ax+by=e x=ed-bf/ad-bc
 cx+dy=f y=af-ec/ad-bc )
 */

package Practical_package;

import java.util.Scanner;

public class PR_2_Cramers_equation {

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
