package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonPane extends Application {
    @Override
    public  void start(Stage primaryStage){
        StackPane stackPane = new StackPane();
        Button button = new Button("OK");
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane,200,250);

        primaryStage.setTitle("Button in Pane");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
