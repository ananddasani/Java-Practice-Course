/*
Program to demonstrate some of the commonly used method for wrapper class for primitive data types
PRACTICE :: Wrapper class for primitive DTs
 */
package basic_package;

public class wrapper_class_for_PDT {

    public static void main(String[] args) {

        //The toString method will convert to string (all values)
        int i = 10;
        double d = 13.34;
        String s1 = Integer.toString(i);
        String s2 = Double.toString(d);

        //The binary , hex and octal conversion
        int n = 10;
        String intToBinary = Integer.toBinaryString(n);
        String intToOctal = Integer.toOctalString(n);
        String intToHex = Integer.toHexString(n);

        System.out.println(n);
        System.out.println(intToBinary);
        System.out.println(intToOctal);
        System.out.println(intToHex);
    }
}
