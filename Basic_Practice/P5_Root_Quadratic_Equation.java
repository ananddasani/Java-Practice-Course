/*
The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:
                            r1 = -b + 2b2 - 4ac/2a
                            and r2 = -b - 2b2 - 4ac/2a
b2 - 4ac is called the discriminant of the quadratic equation.

If it is positive, the equation has two real roots.
If it is zero, the equation has one root.
If it is negative, the equation has no real roots.

Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant.
If the discriminant is positive, display two roots.
If the discriminant is 0, display one root.
Otherwise, display “The equation has no real roots”.

Note that you can use Math.pow(x, 0.5) to compute 2rootX. Here are some
sample runs.
 */
package basic_practice_package;

import java.util.Scanner;

public class P5_Root_Quadratic_Equation {

    public static void main(String[] args) {

        System.out.print("Enter a, b, c :: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //calculate the discriminant by b2 - 4ac
        double discriminant = (b * b) - (4 * (a * c));

        //decide the roots and display them all
        if (discriminant > 0) {
            //then 2 real roots
            double r1 = ((-b) + (Math.pow(discriminant, 0.5))) / (2 * a);
            double r2 = ((-b) - (Math.pow(discriminant, 0.5))) / (2 * a);

            System.out.println("The equation has two roots :: " + r1 + " & " + r2);
        } else if (discriminant == 0) {
            //show one real root
            double r1 = ((-b) + (Math.pow(discriminant, 0.5))) / (2 * a);
            System.out.println("The equation has one root :: " + r1);
        } else {
            //-ve means no root
            System.out.println("The equation as no real roots :(");
        }
    }
}
