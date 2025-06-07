import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {
    // Declare UI components
    TextField num1Field, num2Field, resultField;
    Button addButton, subtractButton, multiplyButton, divideButton;
    
    public void init() {
        // Set layout for the applet
        setLayout(new FlowLayout());

        // Create TextFields for number inputs and result display
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false); // Make result field read-only

        // Create buttons for operations
        addButton = new Button("Add");
        subtractButton = new Button("Subtract");
        multiplyButton = new Button("Multiply");
        divideButton = new Button("Divide");

        // Add components to the applet
        add(new Label("Number 1:"));
        add(num1Field);
        add(new Label("Number 2:"));
        add(num2Field);
        add(new Label("Result:"));
        add(resultField);

        // Add buttons to the applet
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        // Register the applet as the action listener for the buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
    }

    // Action listener method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        // Get the numbers from the text fields
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            // Perform the corresponding operation based on the button clicked
            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Cannot divide by zero");
                    return;
                }
            }

            // Display the result in the result text field
            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            // Handle invalid input
            resultField.setText("Invalid input");
        }
    }
}
