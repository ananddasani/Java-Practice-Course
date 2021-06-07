//Program to demonstrate inheritance in java
package basic_oop_pakage;

//This is a super class (by default all the classes extends Object class if not explicitly extended)
class base extends Object{
    int x;

    base() {
        System.out.println("I am inside the base class's constructor");
    }

    //getters and setter for x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x ");
        this.x = x;
    }
}

//do inheritance using the keyword extends
class derived extends base {
    int y;

    //getter and setter for y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived and setting y");
        this.y = y;
    }

    public derived() {
        System.out.println("in am inside derived class's constructor");
    }
}

public class oop7_inheritance_in_java {

    public static void main(String[] args) {

        //derived can also access the base's data field
        derived d = new derived();
        d.setX(10);
        System.out.println("the value of x is :: " + d.getX());

    }
}
