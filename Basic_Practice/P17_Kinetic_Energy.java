/*
In physics, an object that is in motion is said to have kinetic energy.
The following formula can be used to determine a moving object’s kinetic energy:
                                        KE 5 ½ mv2
The variables in the formula are as follows: KE is the kinetic energy, m is the object’s mass
in kilograms, and v is the object’s velocity, in meters per second.
Write a method named kineticEnergy that accepts an object’s mass (in kilograms) and
velocity (in meters per second) as arguments.
The method should return the amount of kinetic energy that the object has.
Demonstrate the method by calling it in a program that asks the user to enter values for mass and velocity
 */
package basic_practice_package;

import java.util.Scanner;

public class P17_Kinetic_Energy {

    public static void main(String[] args) {

        System.out.print("Enter Mass (kg) and Velocity (m/s) :: ");
        Scanner sc = new Scanner(System.in);
        double kg = sc.nextDouble();
        double v = sc.nextDouble();

        System.out.println("Object has " + KE(kg, v) + " amount of Kinetic Energy :)");
    }

    /**
     * Method for calculating the Kinetic Energy of the object
     *
     * @param mass holding value of mass in Kg
     * @param v    holding value of velocity in m/s
     * @return the kinetic energy of the object
     */
    public static double KE(double mass, double v) {
        return ((mass * (v * v)) / 2);
    }
}
