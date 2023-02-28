package Session8;

import javax.swing.*;
import java.awt.*;

public class RegisterForm extends JFrame{
    JLabel lblHeader = new JLabel("Registration");
    JPanel centerPanel = new JPanel();
    JLabel lblName = new JLabel("Name :");
    JLabel lblPass = new JLabel("Password :");
    JTextField nameField = new JTextField();
    JPasswordField passField = new JPasswordField();
    JPanel footer = new JPanel();
    JButton btnSubmit = new JButton("Submit");

    public RegisterForm()
    {
        add(lblHeader, BorderLayout.NORTH);
        centerPanel.setLayout(new GridLayout(2,2));
        centerPanel.add(lblName);
        centerPanel.add(nameField);
        centerPanel.add(lblPass);
        centerPanel.add(passField);
        add(centerPanel);

        footer.add(btnSubmit);
        add(footer, BorderLayout.SOUTH);

        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new RegisterForm();
    }
}
