import javax.swing.*;

public class LearnSwing {
    /** Create the GUI and show it. */
    private static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("LearnSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the label
        JLabel label = new JLabel("This is pretty cool!");
        frame.getContentPane().add(label);

        // Set the frame size and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

}
