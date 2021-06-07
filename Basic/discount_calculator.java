/*
QUESTION :: calculate discount on sale price of 20% subtracted from the bill
PRACTICE :: Basic Maths
 */
package basic_package;

public class discount_calculator {

    public static void main(String[] args) {

        float regularPrice = 100F; // regular price is $59
        float discount = regularPrice * 0.2F; // discount of 20%
        float sellPrice = regularPrice - discount; // subtracting the discount

        System.out.println("\nregular price = " + regularPrice + "\ndiscount amount = " + discount + " \nsell price = " + sellPrice);
    }
}
