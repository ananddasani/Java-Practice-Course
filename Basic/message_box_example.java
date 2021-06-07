/*
QUESTION :: print the full name of user by using the message box
PRACTICE :: java swing
 */

package basic_package;

import javax.swing.JOptionPane; // for using the dialog box

public class message_box_example {

    public static void main(String[] args){

        String fName = JOptionPane.showInputDialog("What is your first name ? "); // taking first name form user and storing in the fName variable
        String mName = JOptionPane.showInputDialog("What is your middle name ? "); // taking middle name from the user and storing in the mName variable
        String lName = JOptionPane.showInputDialog("What is your last name ? "); // taking last name from the user and storing in the lName variable

        JOptionPane.showMessageDialog(null , "Hello " + fName + " " + mName + " " + lName); // showing the full name of the user

        System.exit(0);
        /*
        unlike a console program , the program which uses the JOptionPane will not automatically stop executing when reached to the end of main method
        because the JOptionPane causes the additional task to run in JVM .
         if the System.exit() method not called this task also known as thread will continue to execute even after the end of main method.
         */
    }
}
