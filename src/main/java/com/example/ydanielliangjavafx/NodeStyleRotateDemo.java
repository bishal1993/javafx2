package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start(Stage stage) {
        StackPane stackPane = new StackPane();
        Button button = new Button("OK");
        button.setStyle("-fx-border-color:blue;");
        stackPane.getChildren().add(button);

        stackPane.setRotate(45);
        stage.setScene(new Scene(stackPane,200,250));
        stage.setTitle("JavaFX Css rotate property");
        stage.show();
    }
}
