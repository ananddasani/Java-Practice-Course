/*
Write the bin2Dec (string binary String) method to convert a binary string into a decimal number.
Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary
string.
 */
package Practical_package;

import java.util.Scanner;

public class PR_15_Dec_To_Binary {

    public static void main(String[] args) {

        System.out.print("Enter the Binary String :: ");
        Scanner sc = new Scanner(System.in);
        String binary = sc.next(); // do not allow the user to enter the blank/white spaces in the expression

        System.out.println("\nBinary  :: " + binary);
        System.out.println("Decimal :: " + bin2Dec(binary));
    }

    public static int bin2Dec(String binary) {
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            //if any char is not binary then no need to continue :)
            if (binary.charAt(i) < '0' || binary.charAt(i) > '1') {
                System.out.println(binary.charAt(i) + " is not valid binary :(");
            } else {
                //else convert particular char to Decimal and keep on adding to decimal String
                decimal += ((binary.charAt(i) - '0') * Math.pow(2, binary.length() - 1 - i));
            }
        }
        return decimal;
    }
}

/*
The NumberFormatException try catch will be added soon :)
keep coding ....

TEST CASE

Enter the Binary String :: 1010

Binary  :: 1010
Decimal :: 10
 */
