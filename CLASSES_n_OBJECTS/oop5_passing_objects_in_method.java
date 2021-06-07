/*
AIM :: unlike the C++ language , when we pass the object as parameter in any method there is not
        the constructor is called like copy constructor is called in C++

NOTE :: when accessing the static member data field make sure to access it with not using object reference
            BUT use class reference instead.
 */
package basic_oop_pakage;

class objectPassing {
    public int x;
    public static int objCount = 0;

    public objectPassing() {
        objCount++;
        System.out.println("Inside the constructor");
    }

    public void setX(int x) {
        this.x = x;
    }
}

public class oop5_passing_objects_in_method {

    public static void main(String[] args) {

        //Creating an object
        objectPassing ob = new objectPassing();
        //Assigning the value
        ob.setX(10);

        System.out.println("Value of object from main is :: " + ob.x);

        //calling print method and passing the object to method
        System.out.println("Calling the print method and passing the object ");
        print(ob);
        System.out.println("Back to main ");

        //TO ACCESS THE STATIC MEMBER USE THE BELOW MENTIONED METHOD ONLY.
        System.out.println("Object should be created is :: " + objectPassing.objCount + " But only one object is created :)");
    }

    /**
     * Method to demonstrate the passing of object as parameter in Method in Java
     * And to show that unlike C++ constructor is not called while passing the object as argument
     *
     * @param object to store the reference of object being passed.
     */
    public static void print(objectPassing object) {
        System.out.println("Value of object form print method is :: " + object.x);
    }
}
