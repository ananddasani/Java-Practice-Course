//Program to demonstrate object class and it's toString method
package basic_oop_pakage;

//all the classes in java are by default inherited from the Object class like this :0
class Loan extends Object {
    public int loan;

    //Constructor for setting loan amount
    public Loan(int amount) {
        this.loan = amount;
    }

    //using one of the method given by Object class (the toString Method ) and overriding to get some useful info.
    public String toString() {
        return "The Loan amount is :: " + this.loan;
    }
}

public class oop_15_Object_class {

    public static void main(String[] args) {

        Loan lObject = new Loan(50000);

        //by default toString method will return a string that describe the object
//        System.out.println(lObject.toString());
//        output ---> practice_oop_pakage.Loan@6d03e736

        //now the overridden method will be called
        System.out.println(lObject);
    }
}

/*
SUMMARY

Every class in Java is descended from the java.lang.Object class.

------------ The toString Method ---------------------

by default toString returns the class name of which the object is instance, with the @ sign and
the address/location of object in hexadecimal

So Usually you should override the toString method so that it returns
a descriptive string representation of the object.

---------------------- NOTE ----------------------

Observe both the System.out.println method

You can also pass an object to invoke System.out.println(object) or
This is equivalent to invoking System.out.println(object.toString())
 */