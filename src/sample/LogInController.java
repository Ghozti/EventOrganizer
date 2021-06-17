package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController {


    //text fields and buttons
    //@FXML
    @FXML
    TextField nameField;

    //PasswordField
    @FXML
    PasswordField passField;

    //loginButton
    @FXML
    Button logInbtn;

    //attributes
    String name,pass;

    public void logIn(ActionEvent event){
        name = getUsername();
        pass = getPassword();
    }

    public String getUsername(){
        return  nameField.getText();
    }

    public String getPassword(){
        return passField.getText();
    }
}
