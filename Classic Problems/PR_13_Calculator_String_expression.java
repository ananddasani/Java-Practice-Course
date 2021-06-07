/*
Write a program for calculator to accept an expression as a string in which the operands and
operator are separated by zero or more spaces.
For ex: 3+4 and 3 + 4 are acceptable expressions.
 */
package Practical_package;

import java.util.Scanner;

public class PR_13_Calculator_String_expression {

    public static void main(String[] args) {

        System.out.print("Enter the string format of expression :: ");
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine(); //Allows the user to input the white/blank spaces in the expression

        //if expression is not as expected then no need to calculate
        if (exp.length() < 3 || exp.length() > 5) {
            System.out.println("Only 2 Operands and 1 Operator is required with or without space as you wish :(");
        } else if (exp.length() == 4) {
            System.out.println("Only 2 Operands and 1 Operator is required with or without space as you wish :(");
        } else {
            //extracting the operator and operands form the entered String expression
            char operator, operand1 = exp.charAt(0), operand2;

            if (exp.length() == 3) {
                //if spaces are not given then length will be 3 ( ex. 3+4)
                operator = exp.charAt(1);
                operand2 = exp.charAt(2);
            } else {
                //else length will be 5 ( ex. 3 + 4)
                operator = exp.charAt(2);
                operand2 = exp.charAt(4);
            }

            //showing the recognized operator and operands
            System.out.println("\nOperand 1 :: " + operand1 + " \nOperator  :: " + operator + " \nOperand 2 :: " + operand2);

            //evaluating the expression
            System.out.println("\nResult -> " + exp + " = " + calculate((int) operand1, operator, (int) operand2));
        }
    }

    /**
     * Method for calculating the expression given by the user
     *
     * @param op1      is the operand 1
     * @param operator is the operator variable
     * @param op2      is the operand 2
     * @return the result of the expression
     */
    public static double calculate(int op1, char operator, int op2) {
        double result = 0;

        //As ASCII code of 0 = 48
        op1 -= 48; // converting string -> int
        op2 -= 48; // converting string -> int

        //calculating on basics of operator entered by the user
        switch (operator) {
            case '+' -> result = (double) op1 + op2;
            case '-' -> result = (double) op1 - op2;
            case '*' -> result = (double) op1 * op2;
            case '/' -> result = (double) op1 / op2;
            case '%' -> result = (double) op1 % op2;
            default -> {
                System.out.println("Invalid operator :(");
                System.exit(0);
            }
        }
        return result;
    }
}

/*
TEST CASE

Enter the string format of expression :: 3 + 4

Operand 1 :: 3
Operator  :: +
Operand 2 :: 4

Result -> 3 + 4 = 7.0
 */
