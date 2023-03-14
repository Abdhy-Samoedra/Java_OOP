package Session9;

import javax.swing.*;
import java.awt.*;

public class FramePict2 extends JFrame {
    DrawPanel panel = new DrawPanel();
    FramePict2() {
        add(panel);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FramePict2();
    }
}

class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    int x = 2;
    int y = 2;
    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // dicasting menjadi g
        g2d.fillRect(x*20,y*20,20,20);
    }
}
