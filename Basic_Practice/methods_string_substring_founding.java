/*
Program to demonstrate some of the most commonly used method to work with sub String in java
PRACTICE :: Static methods of String class
 */
package basic_package;

public class methods_string_substring_founding {

    public static void main(String[] args) {

        String s1 = "Four scores and seven years ago";
        String s2 = "Hi! My self Anand Dasani";

        // the stars with & ends with method (without ignore case)
        // SYNTAX :: boolean startsWith(String str)

        if (s1.endsWith("ago"))
            System.out.println("String 1 ends with 'ago' :)");

        if (s2.startsWith("Hi"))
            System.out.println("String 2 stars with 'Hi' :) ");

        //The region matches method
        //SYNTAX :: boolean regionMatches(int start, String str, int start2, int n)

        String s3 = "Four score and seven years ago";
        String s4 = "Those seven years passed quickly";

        /*
        here 15 --> start form index 15 in s3
        s4 --> string which we have to compare with s3
        6 --> starting index of s3 (to be compared string )
        11 --> length/total number of characters that we want to compare
                            OR
        both region consists of 11 characters
         */
        if (s3.regionMatches(15, s4, 6, 11))
            System.out.println("The region matches :)");
        else
            System.out.println("The region doesn't matches :(");


        String s5 = "Four score and SEVEN YEARS ago";
        String s6 = "Those seven years passed quickly";

        //the region matches method with ignore case parameter
        if (s5.regionMatches(true, 15, s6, 6, 11))
            System.out.println("The regions match by ignoring case :)");
        else
            System.out.println("The regions do not match :(");
    }
}
