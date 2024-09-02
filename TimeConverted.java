import javax.swing.*;
import java.util.*;

public class TimeConverted {
    public static void main(String[] args) {
        String minutes = JOptionPane.showInputDialog("Enter time in minutes: ");
        int mins = Integer.parseInt(minutes);

        int hours = Math.floorDiv(mins, 60);
        int remainingMins = mins % 60;

        JOptionPane.showMessageDialog(null, hours + " hours and " + remainingMins + " minutes.");

    }
}