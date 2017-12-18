package components;

import javax.swing.*;
import java.awt.*;

public class LabeledTextField extends JPanel {
    private JLabel label;
    private JTextField input;
    private JLabel errorMessage;

    public LabeledTextField(String label) {
        this.label = new JLabel(label);
        input = new JTextField();
        input.setPreferredSize(new Dimension(300,40));
        errorMessage = new JLabel();
        errorMessage.setForeground(Color.RED);

        add(this.label);
        add(input);
        add(errorMessage);
    }

    public String getInputValue() {
        return input.getText();
    }

    public void reset() {
        input.setText("");
        errorMessage.setText("");
    }

    public void displayErrorMessage(String message) {
        errorMessage.setText(message);
    }

    public void removeErrorMessage() {
        errorMessage.setText("");
    }
}
