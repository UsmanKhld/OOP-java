import javax.swing.*;
import java.util.*;

public class IfStatement {
    public static void main(String[] args) {

        try {
            String num1 = JOptionPane.showInputDialog("Enter first number");
            int firstNum = Integer.parseInt(num1);

            String num2 = JOptionPane.showInputDialog("Enter second number");
            int secondNum = Integer.parseInt(num2);

            if (firstNum > secondNum) {
                JOptionPane.showMessageDialog(null, firstNum + " is bigger than " + secondNum);
            } else if (secondNum > firstNum) {
                JOptionPane.showMessageDialog(null, secondNum + " is bigger than " + firstNum);
            } else {
                JOptionPane.showMessageDialog(null, firstNum + " = " + num2);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input(s)", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
