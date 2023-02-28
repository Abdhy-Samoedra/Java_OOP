package Session8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Regiter extends JFrame{
    private JPanel Main;
    private JTextField txtName;
    private JTextField txtAddress;
    private JButton submitButton;
public Regiter() {
    submitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = txtName.getText();
            String address = txtAddress.getText();

            JOptionPane.showMessageDialog(null,name);
            JOptionPane.showMessageDialog(null,address);
        }
    });
}

    public static void main(String[] args) {
        Regiter r = new Regiter();
        r.setContentPane(new Regiter().Main);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setVisible(true);
        r.pack();
    }
}
