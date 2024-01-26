package com.switchc4se.texttobinary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TextToBinaryController {

    @FXML
    private TextArea inputText;

    @FXML
    private TextArea outputBinary;

    private static String charToBinary(char c) {
        return String.format("%8s", Integer.toBinaryString(c));
    }

    @FXML
    void convertToBinary(ActionEvent event) {
        String inputTextValue = inputText.getText();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputTextValue.length(); i++) {
            char current = inputTextValue.charAt(i);
            if (current == ' ') {
                result.append(' ');
            } else {
                String bin = charToBinary(current);
                result.append(bin);
            }
        }
        String finalResult = result.toString();
        outputBinary.setText(finalResult);
    }

    @FXML
    private void initialize() {
        // Enable word wrap for the outputBinary TextArea
        outputBinary.setWrapText(true);
    }
}
