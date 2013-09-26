package ch.hsr.p1meier.u2.teilaufgabe3;

import javax.swing.*;
import java.awt.*;

/**
 * User: p1meier
 * Date: 26.09.13
 */
public class Teilaufgabe3 {
    private JPanel panel2;

    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JTextField textField1;
    private JPanel myForm;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teilaufgabe3");
        frame.setContentPane(new Teilaufgabe3().myForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
    }
}
