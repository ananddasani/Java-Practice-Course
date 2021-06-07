/*
Program to demonstrate some of the commonly used substring methods in java
PRACTICE :: Static methods of String class
 */
package basic_package;

public class methods_string_substring {

    public static void main(String[] args) {

        // SYNTAX :: String substring(int start)
        // String substring(int start, int end)
        String fullName = "Anand P Dasani";
        String firstName = fullName.substring(0, 5); //starting form 0 and goes to 4 (5 - 1)
        String lastName = fullName.substring(8); //starting form 8 and goes to end

        System.out.println("Full name :: " + fullName);
        System.out.println("First name :: " + firstName);
        System.out.println("Last name :: " + lastName);

        //The getChars method for extracting substring and storing them in a array
        //void getChars(int start, int end, char[] array, int arrayStart)
        String myName = "Anand P Dasani";
        char[] arr = new char[6]; //making an array for my first name

        myName.getChars(0, 5, arr, 0);
        // 0 -->  substring’s starting position,
        // 5 -->  substring’s ending position,
        // arr --> The characters in the substring are stored as elements in the array
        // 0 --> specify the index where the characters are to be stored in array

        System.out.println("\n\nFull name :: " + myName);
        System.out.println("The values in the array are :: ");
        for (int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + "    ");

        // the toChar() : char[]  method for converting String to character array
        // SYNTAX :: char[] toCharArray()
        char[] nameArray = myName.toCharArray();
        System.out.println("\n\nThe full name is :: " + myName);

        //display the array
        for (char ch : nameArray)
            System.out.print(ch + "  ");
    }
}
