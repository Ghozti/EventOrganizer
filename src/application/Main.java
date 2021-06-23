package application;

import application.controllers.LogInController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxlm/login.fxml"));
        primaryStage.setTitle("Event Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void changeScene(String fxml,String name, double w, double h) throws IOException, IOException {
        Stage stg = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        stg.setTitle(name);
        stg.setMaxHeight(h);
        stg.setMaxWidth(w);
        stg.setResizable(false);
        stg.setScene(new Scene(root,w,h));
        stg.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
