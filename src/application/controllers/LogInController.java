package application.controllers;

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

    //register btn
    @FXML
    Button register;

    //attributes
    String name,pass;
    public static boolean registerNewAccount = false;

    public void logIn(ActionEvent event){
        name = getUsername();
        pass = getPassword();
    }

    public void register(ActionEvent event){
        registerNewAccount = true;
    }

    public String getUsername(){
        return  nameField.getText();
    }

    public String getPassword(){
        return passField.getText();
    }
}
