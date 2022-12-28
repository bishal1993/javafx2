package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        Button button = new Button("OK");
        Scene scene = new Scene(button,200,250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");

        Button button1 = new Button("New Stage");
        Scene scene1 = new Scene(button1,200,250);
        stage.setScene(scene1);
        stage.setTitle("New Stage");
        stage.setResizable(false);
        stage.show();

    }
}
