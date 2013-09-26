package ch.hsr.p1meier.u2.teilaufgabe2;

import javax.swing.*;
import java.awt.*;

/**
 * User: p1meier
 * Date: 26.09.13
 */
public class Teilaufgabe2 {
    private JPanel myForm;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teilaufgabe2");
        frame.setContentPane(new Teilaufgabe2().myForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
    }
}
