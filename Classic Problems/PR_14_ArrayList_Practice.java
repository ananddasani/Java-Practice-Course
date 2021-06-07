/*
Write a program that creates an Array List and adds a Loan object , a Date object , a string, and a
Circle object to the list, and use a loop to display all elements in the list by invoking the object’s to
String() method.

 */
package Practical_package;

import java.util.ArrayList;
import java.util.Date;

class circle {
    private double radius;

    //constructor
    public circle(double r) {
        this.radius = r;
    }

    public String toString() {
        return "Circle having radius :: " + this.radius;
    }
}

class loan {
    private double loanAmount;

    //constructor
    public loan(double amt) {
        this.loanAmount = amt;
    }

    public String toString() {
        return "Loan amount is :: " + this.loanAmount;
    }
}

public class PR_14_ArrayList_Practice {

    public static void main(String[] args) {

        ArrayList<Object> arr = new ArrayList<Object>();

        //adding objects loan date string and circle to ArrayList
        arr.add(new loan(10000.50));
        arr.add(new Date());
        arr.add(new String("String class"));
        arr.add(new circle(10));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println((arr.get(i)).toString());
        }
    }
}

/*
TEST CASE

Loan amount is :: 10000.5
Wed May 05 19:31:25 CST 2021
String class
Circle having radius :: 10.0

 */