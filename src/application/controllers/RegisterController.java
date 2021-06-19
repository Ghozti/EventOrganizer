package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

import java.awt.*;

public class RegisterController {

    private final String passErrLabel = "passwords did not match", successLabel = "Success! you may now leave this page";

    @FXML
    javafx.scene.control.TextField name;

    @FXML
    PasswordField pass;

    @FXML
    PasswordField cPass;

    @FXML
    Label passErrLbl, continueLbl;

    public void continueRegistration(ActionEvent event){

        if(!getPass().equals(getCPass())){
            setPassErrLbl();
        }else {
            setContinueLbl();
        }
    }

    String getName(){
        return name.getText();
    }

    String getPass(){
        return pass.getText();
    }

    String getCPass(){
        return cPass.getText();
    }

    void setPassErrLbl(){
        passErrLbl.setText(passErrLabel);
    }

    void setContinueLbl(){
        continueLbl.setText(successLabel);
    }
}
