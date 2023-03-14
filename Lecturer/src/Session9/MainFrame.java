package Session9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener, WindowListener, MouseListener, MouseMotionListener {
    public static void main(String[] args) {
        new MainFrame();
    }

    private JButton btn = new JButton("Button");
    private JButton btn2 = new JButton("Footer");
    private JButton btn3 = new JButton("Header");

    private int count = 0;

    // cara 2 (1 komponen 1 action listener)
    private ActionListener actionBtn3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"ini header");
            count++;
            btn3.setText("Header" + count);
            // harus di attach
        }
    };

    public MainFrame() {
        add(btn);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.NORTH);

        btn.addActionListener(this);
        btn.addMouseMotionListener(this);

        btn2.addActionListener(this);

        btn3.addActionListener(actionBtn3);

        addWindowListener(this);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click me");

//        untuk percabangan button jika terdapat banyak button
//        cara 1 (1 actionistener tapi ada 2 komponen)
        if (e.getSource() == btn) {
            JOptionPane.showMessageDialog(this, "Hello world");
            int res = JOptionPane.showConfirmDialog(this, "yakin?");
            String result = JOptionPane.showInputDialog("Masukkan nama");
            System.out.println("Nama" + result + "\nButton" + res);
        } else if (e.getSource() == btn2) {
            JOptionPane.showMessageDialog(this,"ini Footer");
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window iconifed");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window deiconifed");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window deactivated");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("X: " + e.getX() + ",Y: " + e.getY());
    }
}