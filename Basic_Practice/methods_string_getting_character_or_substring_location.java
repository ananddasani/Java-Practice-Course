/*
Program to demonstrate some of the most commonly used methods to find the location of any character or substring
PRACTICE :: Static methods of String class
 */
package basic_package;

public class methods_string_getting_character_or_substring_location {

    public static void main(String[] args) {

        String s1 = "Four scores and seven years ago";
        int start, last;

        //The indexOf method (FOR CHAR)
        //SYNTAX :: int indexOf(char ch)
        // int indexOf(char ch, int start)
        // int lastIndexOf(char ch)
        // int lastIndexOf(char ch, int start)
        start = s1.indexOf('r');
        last = s1.lastIndexOf('r');

        System.out.println("The letter r first appears at position :: " + start);
        System.out.println("The letter r last appears at position :: " + last);

        /*
        The following code is very similar,
        but it uses the lastIndexOf method and shows the positions in reverse order:
         */

        int position;
        System.out.println("\nThe letter r appears at the following positions :)");

        position = s1.lastIndexOf('r');
        while (position != -1) {
            System.out.println(position);
            position = s1.lastIndexOf('r', position - 1);
            //give the start position else while loop tend to infinite :(
        }

        //The indexOf method (FOR STRING)
        String s2 = "and a one and a two and a three";

        System.out.println("\nThe word and first appears at position :: " + s2.indexOf("and"));
        System.out.println("The word and last appears at position :: " + s2.lastIndexOf("and"));


        /*
        The following code is very similar,
        but it uses the lastIndexOf method and shows the positions in reverse order for string:
         */

        System.out.println("\nThe word and appears at the following positions :)");

        position = s2.lastIndexOf("and");
        while (position != -1) {
            System.out.println(position);
            position = s2.lastIndexOf("and", position - 1);
        }
    }
}
