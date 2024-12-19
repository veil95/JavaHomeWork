package prac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordCheckApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordCheckFrame::new);
    }
}

class PasswordCheckFrame extends JFrame {
    public PasswordCheckFrame() {
        setTitle("Password Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel userLabel = new JLabel("User name:");
        JTextField userField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();

        JButton submitButton = new JButton("Submit");

        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(new JLabel()); // Placeholder for alignment
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (password.length() < 8) {
                    JOptionPane.showMessageDialog(PasswordCheckFrame.this,
                            "Password must be at least 8 characters long.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(PasswordCheckFrame.this,
                            "Passwords do not match.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(PasswordCheckFrame.this,
                            "Username: " + username + "\nPassword is valid.",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}