package ch.hsr.p1meier.u2.teilaufgabe1;

import javax.swing.*;
import java.awt.*;

/**
 * User: p1meier
 * Date: 26.09.13
 */
public class Teilaufgabe1 {
    private JPanel myForm;
    private JButton button2;
    private JButton button3;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teilaufgabe1");
        frame.setContentPane(new Teilaufgabe1().myForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
    }
}
