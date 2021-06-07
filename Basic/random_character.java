/*
QUESTION :: generate random character
PRACTICE :: generating Random character
 */
package basic_package;

public class random_character {

    public static void main(String[] args) {

        // both are correct
        char ch1 = (char) ((int) 'a' + Math.random() * ((int) 'z' - (int) 'a' + 1)); // to need to explicitly type cast char -> int
        char ch2 = (char) ('a' + Math.random() * ('z' - 'a' + 1)); // when char is operated with int , automatically it will type casted to int
        System.out.println(ch1 + ch2);
    }
}
