package basic_oop_pakage;//program to demonstrate classes and objects in java

//this is the custom class
class employee1111 {
    // attribute / properties of class
    int id;
    int salary;
    String name;

    // method of class (getter and setter) / (accessor and mutator)
    public int getSalary() {
        return salary;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }
}

public class oop1_class_objects_demo {

    public static void main(String[] args) {

        employee1111 anand = new employee1111();
        anand.id = 12;
        anand.salary = 500000;
        anand.setName("Anand Dasani"); // will set name of object anand
        System.out.println(anand.getName()); // will return name of object anand
        System.out.println(anand.getSalary());
    }
}

//TODO solve hte square_calculation practice question to get grip on objects and classes in java