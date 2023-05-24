package Session10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MainFrame extends JFrame implements ActionListener {

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    JMenuItem loginMenuItem = new JMenuItem("Login");
    JDesktopPane desktopPane = new JDesktopPane();
    JInternalFrame frame = null;

    MainFrame() {
        menuBar.add(fileMenu);
        fileMenu.add(loginMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        loginMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        setJMenuBar(menuBar);

        setContentPane(desktopPane);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

    }

    public static void main(String[] args) {
        new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            dispose();
        }
        if (e.getSource() instanceof JMenuItem menu) {
            if (menu.getText().equals("Login")) {
//                JFrame frame = new JFrame();
//                frame.setVisible(true);
//                frame.setSize(200,200);
                if (frame == null || frame.isClosed()) {
                    frame = new JInternalFrame("Internal",true,true,true,true);
                    Vector<String> header = new Vector<>();
                    header.add("Name");
                    header.add("Score");
                    Vector<Vector<String>> data = new Vector<>();
                    Vector<String> row = new Vector<>();
                    row.add("Budi");
                    row.add("92");
                    data.add(row);
                    row = new Vector<>();
                    row.add("susi");
                    row.add("122");
                    data.add(row);
                    frame.add(new JTable(data,header));
                    desktopPane.add(frame);
                }

                frame.setVisible(true);
                frame.setBounds(50, 50, 200, 200);

            }
        }
    }
}
