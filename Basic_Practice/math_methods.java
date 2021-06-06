/*
Program to Demonstrate some of the commonly used Math methods in java
PRACTICE :: Maths methods
 */
package basic_package;

public class math_methods {

    public static void main(String[] args) {

        // TRIGONOMETRIC METHODS
        System.out.println("\t\tTRIGONOMETRIC METHODS\n");
        System.out.println("sin => " + Math.sin(0)); // returns trigonometric sine of angle in radian
        System.out.println("sin => " + Math.sin(Math.PI / 2)); // PI & E are two double constant given gy java
        System.out.println("sin => " + Math.toDegrees(Math.PI / 2)); // converts pi/2 in degree
        System.out.println("sin => " + Math.toRadians(30)); // converts the radian to degree
        System.out.println("sin => " + Math.sin(270)); // converts the radian to degree
        System.out.println("sin => " + Math.sin(270)); // returns the sine in angle
        System.out.println("inverse sin => " + Math.asin(0.5)); // returns return value is degree

        // EXPONENTIAL METHODS
        System.out.println("\n\t\tEXPONENTIAL METHODS\n");
        System.out.println("EXP => " + Math.exp(1)); // returns e raised to power of x
        System.out.println("LOG e => " + Math.log(Math.E)); // returns the natural log of x
        System.out.println("LOG 10 => " + Math.log10(10)); // returns the log to base 10 of x
        System.out.println("power => " + Math.pow(2, 3)); // returns the power of a raise to b
        System.out.println("square root => " + Math.sqrt(4)); // returns the square root of x if x>= 0

        // ROUNDING METHODS
        System.out.println("\n\t\tROUNDING METHODS\n");
        System.out.println("ciel => " + Math.ceil(2.000001)); // value will be rounded up
        System.out.println("ciel => " + Math.ceil(-2.1)); // value will be rounded up
        System.out.println(" floor => " + Math.floor(2.1)); // value will be rounded down
        System.out.println(" floor => " + Math.floor(-2.1)); // value will be rounded down
        // rint will return double value
        System.out.println("rint => " + Math.rint(2.6)); // value will be rounded up (.5 will mater) (x + 0.5)
        System.out.println("rint => " + Math.rint(-2.5)); // value will be rounded up (.5 will mater) (x + 0.5)
        // round will return int or long
        System.out.println(" round => " + Math.round(5.1)); // same as rint (return long if parameter is double)
        System.out.println(" round => " + Math.round(5.6f)); // same as rint (return int if parameter is float)

        // MAX , MIN , AND ABSOLUTE METHODS
        System.out.println("\n\t\tMAX , MIN , AND ABSOLUTE METHODS\n");
        System.out.println("MAX => " + Math.max(2.5, 4)); // returns the maximum number from the argument passed
        System.out.println("MIN => " + Math.min(2, 4)); // returns the minimum number from the argument passed
        System.out.println("|ABS| => " + Math.abs(-2.1)); // simply the mod method or magnitude

        // RANDOM METHOD
        int num = 65 + (int) (Math.random() * 26); // generate random numbers between 65 to 90
        System.out.println("RANDOM NUMBER => " + num);
        int ch = (int) (Math.random() * 26); // generate random character between A to Z
        System.out.printf("RANDOM CHARACTER => %c", (65 + ch));
    }
}