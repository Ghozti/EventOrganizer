package application.controllers;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

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

    public void logIn(ActionEvent event){
        name = getUsername();
        pass = getPassword();
    }

    public void register(ActionEvent event) throws IOException {
        System.out.println("hiii");
        Main main = new Main();
        main.changeScene("fxlm/register.fxml","register",600,400);
    }

    public String getUsername(){
        return  nameField.getText();
    }

    public String getPassword(){
        return passField.getText();
    }
}
