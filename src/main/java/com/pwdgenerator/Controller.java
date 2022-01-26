package com.pwdgenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class Controller {

    @FXML
    private Button copy;

    @FXML
    private Button generate;

    @FXML
    private TextField length;

    @FXML
    private CheckBox lowercase;

    @FXML
    private CheckBox number;

    @FXML
    private TextField result;

    @FXML
    private CheckBox symbols;

    @FXML
    private CheckBox uppercase;

    @FXML
    void generatePassword(ActionEvent event) {
        int size;
        if(length.getText().equals("")) {
            size = 20;
        } else {
            size = Integer.parseInt(length.getText());
        }
        Generator g = new Generator(uppercase.isSelected(), lowercase.isSelected(), number.isSelected(), symbols.isSelected(), size);
        result.setText(g.generate());
    }

    @FXML
    void copy(ActionEvent event) {
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(result.getText());
        clipboard.setContent(content);
    }

}