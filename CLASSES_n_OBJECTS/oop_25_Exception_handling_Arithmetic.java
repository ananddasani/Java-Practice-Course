//Program to Demonstrate simple try-catch block in java with throw and throws
//Program will prevent Arithmetic Error (/ by Zero)
package basic_oop_pakage;

import java.util.Scanner;

public class oop_25_Exception_handling_Arithmetic {

    public static void main(String[] args) {

        System.out.println("START");

        System.out.print("Enter 2 non-zero numbers to Preform division :: ");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        try {
            System.out.println(n1 + " / " + n2 + " = " + divide(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("END");
    }

//    /**
//     * This method will not work because if statement occurs then program terminates abnormally
//     * without returning any value :(
//     *
//     * so here if-else will not work instead we have to use try-catch block to handle the exception case if any :)
//     * @param n1 is first number
//     * @param n2 is second number
//     * @return division of both number
//     */
//    public static double divide(int n1 , int n2){
//        if(n2 == 0)
//            System.out.println("divisor can't be Zero :(");
//        else
//            return n1 / n2;
//    }

    /**
     * Now this method will work because the exception will be thrown if second number will be 0
     *
     * @param n1 for first number
     * @param n2 for second number
     * @return division of both numbers
     * @throws ArithmeticException if second number is zero
     */
    public static double divide(double n1, double n2) {

        if (n2 == 0)
            throw new ArithmeticException("DIVISOR CAN'T BE ZERO :(");
        else
            return n1 / n2;
    }
}

/*
Remember floating point can be divided by 0 , no error will be thrown

completely acceptable --> 1.0 / 0                 :)
 */
