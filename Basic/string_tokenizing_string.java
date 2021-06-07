/*
Program to demonstrate how to tokenize a string by using of split method of string class :)
PRACTICE :: Tokenizing of String
 */
package basic_package;

public class string_tokenizing_string {

    public static void main(String[] args) {

        //Split demo 1 (Single character delimiter)
        String s1 = "one two three four five";

        // Get the token using a space delimiter
        String[] tokens = s1.split(" ");

        // Display the tokens
        for (String s : tokens)
            System.out.println(s);


        //Split demo 2 (Multi character delimiter)
        String s2 = " anand.dasani@gmail.com#1234      "; // delimiter --> [.@]

        // ALWAYS TRIM THE STRING BEFORE TOKENIZE (to prevent the leading and trailing WS chars to becoming tokens)
        s2 = s2.trim();

        //get result in array
        String[] token2 = s2.split("[.@#]");

        for (String s : token2)
            System.out.println(s);
    }
}
