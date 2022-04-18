package ru.gb.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextArea messageArea;

    @FXML
    private TextField messageField;

    public ChatController() {
        Chat chat = new Chat();
    }

    @FXML
    private void checkButtonClick(ActionEvent actionEvent) {
        final String message = messageField.getText();
        if (message.isEmpty()) {
            return;
        }

        final String text = String.format("Пользователь: %s", message);
        messageArea.appendText(text + "\n");
        messageField.clear();
        messageField.requestFocus();
    }
}
