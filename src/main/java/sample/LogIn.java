package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogIn {
    public LogIn() {
    }

    @FXML
    private Button button;

    @FXML
    private Label wrongLogIn;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) {
        checkLogin();
    }

    public void checkLogin() {
        Main m = new Main();
        if(username.getText().equals("dat") && password.getText().equals("123")) {
            wrongLogIn.setText("Success!");
            m.chanceScene();
        } else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }
        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }
}
