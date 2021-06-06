/*
program to display the message box
PRACTICE :: java swing
 */
package basic_package;
import  javax.swing.JOptionPane;

public class message_box {

    public static void main(String[] args) {

        // below line of code will popup the message dialog box with the given message
        JOptionPane.showMessageDialog(null , "Hello , I am Anand Dasani");

        /*
        The first argument is only important in programs that display other graphical windows.
        Until then, we will always pass the key word null as the first argument.
        This causes the dialog box to be displayed in the center of the screen.
        The second argument is the message that we wish to display in the dialog box.
        When the user clicks the OK button, the dialog box will close
         */

        // below line of code will popup the input dialog box with the given message
        String name;
        name = JOptionPane.showInputDialog("Enter your name ");

        /*
        The argument passed to the method is a message to display in the dialog box.
        This statement will cause the dialog box to be displayed in the center of the screen.
        If the user clicks the OK button, name will reference the string value entered by the user into the text field.
        If the user clicks the Cancel button, name will reference the special value null.
         */
    }
}
