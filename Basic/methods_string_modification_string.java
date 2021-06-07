/*
Program to demonstrate some of the most commonly used string methods to modify the string by using java's default methods
PRACTICE :: Static methods of String class
 */
package basic_package;

public class methods_string_modification_string {

    public static void main(String[] args) {

        //The String concat method will concat second string with the content of object that is calling it
        //SYNTAX :: String concat(String str)
        String firstName = "Anand ";
        String lastName = "Dasani ";
        String fullName = firstName.concat(lastName); // Equivalent to firstName + lastName (both output the same)
        System.out.println("My full name is :: " + fullName);


        //The String replace method will replace the old char to new char
        //SYNTAX :: String replace(char oldChar, char newChar)
        String str1 = "Raj Ria Rucha Ronit Rohit";
        String str2 = str1.replace('R', 'T');

        System.out.println("\n");
        System.out.println(str1);
        System.out.println(str2);


        //The String's Trim method which returns a copy of a String object with all leading and trailing whitespace characters deleted
        // SYNTAX String trim()
        String greeting1 = "  Hello  ";
        String greeting2 = greeting1.trim();

        System.out.println("\n\n*" + greeting1 + "*");
        System.out.println("*" + greeting2 + "*");
    }
}
