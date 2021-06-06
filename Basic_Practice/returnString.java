/*
program to demonstrate the return of reference fo string form the method
PRACTICE :: Methods in Java
 */
package basic_package;

public class returnString {

    public static void main(String[] args) {

        String name = fullName("anand", "dasani");
        System.out.println(name);
    }

    /**
     * the fullName method accepts two strings.
     * it concatenates them into one string and return that to calling function
     *
     * @param fName for storing first name
     * @param lName for storing last name
     * @return the string which is concatenation of fName and lName
     */
    public static String fullName(String fName, String lName) {
        String full = fName + " " + lName;
        return full;
    }
}
