//program to demonstrate dynamic method dispatch
package basic_oop_pakage;

class phone {

    public void name() {
        System.out.println("My name is JAVA form class Phone");
    }
}

class smartPhone extends phone {

    @Override
    public void name() {
        System.out.println("My name is JAVA in class smartPhone");
    }

    public void greet() {
        System.out.println("Hello !! , welcome to java");
    }
}

public class oop11_Dynamic_method_dispatch {

    public static void main(String[] args) {

        phone obj = new phone(); //Allowed
        smartPhone smobj = new smartPhone(); //Allowed

        //reference is of phone  (Reference is of super class and object is of sub class)
        phone object = new smartPhone(); // Allowed

        // reference is of smartPhone (Reference is of sub class and object of is super class)
//        smartPhone object2 = new phone(); --> error :(

        //now try to run method name and see which name method will run
        object.name();
        //name of samrtPhone is running because the actual object is of samrtPhone although reference is of Phone

        //but this will not work
//        object.greet(); --> not allowed
    }
}

/*
SUMMARY

SUB obj = new SUPER ==> NOT ALLOWED :(

BUT

SUPER obj = new SUB --> ALLOWED :)
//here we can only call the method which are lying in super class
//can't we run method which is not method of super but method of sub :(

this is called "DYNAMIC METHOD DISPATCH"
because which method is to run is decided on the run time

whenever "new" is user -> run time creation is done not compile time :)
 */
