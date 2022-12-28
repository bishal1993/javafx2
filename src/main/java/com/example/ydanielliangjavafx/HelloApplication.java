package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       Button button = new Button("OK");
        Scene scene = new Scene(button, 320, 240);
       stage.setTitle("MyJavaFX");
       stage.setScene(scene);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}