/*
Write a program that prompts the user to enter a decimal number and displays the number in a
fraction.
Hint: Read the decimal number as a string, extract the integer part and fractional part from the
string.
 */
package Practical_package;

import java.util.Scanner;

public class PR_16_Decimal_To_Fractional_Display {

    public static void main(String[] args) {

        System.out.print("Enter the decimal number :: ");
        Scanner sc = new Scanner(System.in);
        String decimal = sc.next();

        int real = 0;
        int fraction = 0;

        //extracting the decimal part form the given string
        for (int i = 0; i < decimal.indexOf('.'); i++)
            real += decimal.charAt(i);

        //extracting the fractional part form the given string
        for (int i = decimal.indexOf('.'); i < decimal.length(); i++)
            fraction += decimal.charAt(i);

        //displaying the number in fraction
        System.out.println("\nOriginal number :: " + decimal);
        System.out.println("Decimal Part :: " + real);
        System.out.println("Fractional Part :: " + fraction);
    }
}

/*
TEST CASE

Not getting the excepted result :(

 */

/*
HINT ::

public class Rational {

    private int num, denom;

    public Rational(double d) {
        String s = String.valueOf(d);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            d *= 10;
            denom *= 10;
        }

        int num = (int) Math.round(d);
        this.num = num;
        this.denom = denom;
    }

    public Rational(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public String toString() {
        return String.valueOf(num) + "/" + String.valueOf(denom);
    }

    public static void main(String[] args) {
        System.out.println(new Rational(1.5));
    }
}

OUTPUT :: 1.5 = 1 / 2
 */