package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginbutton;

    @FXML
    private Label wronglogin;


    @FXML
    void userLogin(ActionEvent event) throws IOException {
        checkLoginpatient();
        checkLoginHealthPersonel();

    }

    private void checkLoginpatient() throws IOException {
        Main main = new Main();
        if (username.getText().toString().equals("hej") && password.getText().equals("hej")) {
            wronglogin.setText("Success!");
            main.changeScene("afterLogin.fxml");
        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wronglogin.setText("Indsæt din data");
        } else {
            wronglogin.setText("Wrong username or password");
        }

    }

    private void checkLoginHealthPersonel() throws IOException {
        Main main = new Main();
        if (username.getText().toString().equals("hp") && password.getText().equals("hp")) {
            wronglogin.setText("Success!");
            main.changeScene("lægeLogin.fxml");
        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wronglogin.setText("Indsæt din data");
        } else {
            wronglogin.setText("Wrong username or password");
        }


    }
}
