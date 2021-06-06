/*
Program to demonstrate some of the commonly used string methods to get value of the particular string
PRACTICE :: Static methods of String class
 */
package basic_package;

public class methods_string_valueOf {

    public static void main(String[] args) {

        // String valueOf(boolean b)

        //primitives DT
        boolean bool = true;
        int i = 10;
        float f = 1.3F;
        double d = 1.00000034D;
        char ch = 'a';
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(ch));

        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(String.valueOf(letters));
        System.out.println(String.valueOf(letters, 1, 3));
        // letter --> char array
        // 1 --> starting subscript
        // 3 --> number of elements
    }
}
