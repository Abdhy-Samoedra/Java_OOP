package Session8;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // ini wajib ditambahin setiap awal
        JFrame frame = new JFrame("this is Frame");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel centrePanel = new JPanel();
        centrePanel.setLayout(new GridLayout(4,3));

        JButton btn = new JButton("Button");
        centrePanel.add(btn);
        JButton btn2 = new JButton("Button2");
        centrePanel.add(btn2);
        for (int i = 0; i < 10; i++) {
            centrePanel.add(new JButton("button"+i));
        }
        frame.add(centrePanel);
        JLabel label = new JLabel("this is label");
        frame.add(label, BorderLayout.NORTH);

        JTextField txtField = new JTextField();
        frame.add(txtField, BorderLayout.SOUTH);

        // selalu diset dipaling bawah
        frame.setVisible(true);
    }
}
