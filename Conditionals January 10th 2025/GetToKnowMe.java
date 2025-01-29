import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetToKnowMe {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Name");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(15);
        JLabel countryLabel = new JLabel("Enter your Country:");
        JTextField countryField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        JLabel outputLabel = new JLabel("");

        // Add action to button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String country = countryField.getText();
                outputLabel.setText("Hello, " + name + "!" + " from " + country);
            }
        });

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(countryLabel);
        frame.add(countryField);
        frame.add(submitButton);
        frame.add(outputLabel);

        // Make frame visible
        frame.setVisible(true);
    }
}
