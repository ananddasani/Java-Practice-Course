package basic_oop_pakage;//Program to demonstrate ArrayList in java

import java.util.ArrayList;

public class oop_16_ArrayList {

    public static void main(String[] args) {

        //creating Array List object
        ArrayList<String> arr = new ArrayList<String>();
        // () means by default capacity is 10
        // (100) now capacity is 100


        //----------------------------------------------------------------------

        //adding items in Array List
        arr.add("Anand");
        arr.add("Ria");
        arr.add("Meet");

        // adding object at specific index
        arr.add(1, "Dasani");


        //----------------------------------------------------------------------

        //getting the length / size of array list
        System.out.println("Array list having " + arr.size() + " objects in it :)");

        //getting the specific object
        System.out.println("First Name is " + arr.get(0));


        //----------------------------------------------------------------------

        //removing object
//        arr.remove(1);


        //----------------------------------------------------------------------
        //replacing an item
        arr.set(1, "DASANI");


        //----------------------------------------------------------------------

        //displaying the list using for loop
        for (int i = 0; i < arr.size(); i++)
            System.out.println((i + 1) + ". " + arr.get(i));

        //displaying the list using for each loop
        for (String items : arr)
            System.out.println(items);

        //displaying the list using ArrayList's toString Method
        System.out.println(arr);


        //----------------------------------------------------------------------

        //Removing all elements
        arr.clear();
        System.out.println(arr);
    }
}

/*
ArrayList is a class in the Java API that is similar to an array and allows
you to store objects. Unlike an array, an ArrayList object’s size is
automatically adjusted to accommodate the number of items being stored
in it.

An ArrayList object can be used to store a list of objects.


 */
