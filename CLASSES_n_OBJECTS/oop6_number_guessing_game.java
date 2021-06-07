//Program to make a number guessing game by using the oop concepts you have learned till now

package basic_oop_pakage;

import java.util.Random;
import java.util.Scanner;

class numberGuessing {
    private int originalNumber;
    private int guessedNumber;
    private int numberOfTrial = 0;

    //Method to generate the random number
    public void generateNumber() {
        Random r = new Random();
        this.originalNumber = r.nextInt(100);
    }

    //Method for taking the user input
    public void takeUserInput() {
        this.numberOfTrial++; // incrementing to get the number of trials

        System.out.print("Guess the number :: ");
        Scanner sc = new Scanner(System.in);
        this.guessedNumber = sc.nextInt();
    }

    //Method for validating the number guessed by the user
    public boolean isGuessed() {

        //if the number guesses is correct then return true for ending the loop
        if (this.originalNumber == this.guessedNumber) {
            System.out.println("you guessed it Right in " + this.numberOfTrial + " trials!! i was also thinking of :: " + this.originalNumber);
            return true;
        }

        //else give the hint message to the user to guess the number correctly
        if (this.guessedNumber < this.originalNumber)
            System.out.println(guessedNumber + " is too less :(");
        else if (this.guessedNumber > this.originalNumber)
            System.out.println(this.guessedNumber + " is too high :(");

        return false; // returning false for continuing the loop
    }
}

public class oop6_number_guessing_game {

    public static void main(String[] args) {

        //flag for guessed number
        boolean guessed = false;

        //first creating the object
        numberGuessing obj = new numberGuessing();

        //then generate the number to begin the game
        obj.generateNumber();

        while (!guessed) {

            // now take user input
            obj.takeUserInput();

            //validate the guesses number
            guessed = obj.isGuessed();
        }
    }
}
