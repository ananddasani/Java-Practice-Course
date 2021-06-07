//Program to demonstrate abstract class in java
package basic_oop_pakage;

abstract class parent {
    public parent() {
        System.out.println("I am constructor of class Base1");
    }

    public void sayHello() {
        System.out.println("Hello !!");
    }

    //this is abstract method which all the child of parents have to compulsory implement in them
    abstract public void greet();
}

class child extends parent {

    //here greet method of parent must be implemented compulsory to proceed further
    @Override
    public void greet() {
        System.out.println("Good Morning :)");
    }
}

//Multiple inheritance
class child2 extends parent {

    //in this also there must be abstract method greet of parent must be implemented
    @Override
    public void greet() {
        System.out.println("Hello !! form child2 class :)");
    }
}

public class oop12_abstract_class_in_java {

    public static void main(String[] args) {

        // parent is an abstract class so can't create object of them :(
        // you can if you implement the abstract method of them :)
//        parent = new parent(); --> error

        child obj = new child(); //allowed
        child2 object = new child2(); //allowed

        //some code here ...

    }
}

/*
what is ABSTRACT ?
present in though as an idea and not present in concrete / real

what is ABSTRACT METHOD ?
A Method which is declared without any implementation

ABSTRACT CLASS
A class which is having Abstract method in it

SUMMARY
Abstract class help other class to implement concrete class by giving the basic template we can say
 */
