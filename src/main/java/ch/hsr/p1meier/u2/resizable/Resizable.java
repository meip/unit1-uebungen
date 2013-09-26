package ch.hsr.p1meier.u2.resizable;

import javax.swing.*;
import java.awt.*;

/**
 * User: p1meier
 * Date: 26.09.13
 */
public class Resizable {
    private JPanel myForm;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Resizable");
        frame.setContentPane(new Resizable().myForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
    }
}
