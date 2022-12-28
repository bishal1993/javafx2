package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new CustomPane("Top"));
        borderPane.setCenter(new CustomPane("Center"));
        borderPane.setBottom(new CustomPane("Bottom"));
        borderPane.setRight(new CustomPane("Right"));
        borderPane.setLeft(new CustomPane("Left"));

        Scene scene = new Scene(borderPane);
        stage.setTitle("Show Border Pane");
        stage.setScene(scene);
        stage.show();


    }
}

class CustomPane extends StackPane {
    public CustomPane(String title) {
        getChildren().add(new Label(title));
       setStyle("-fx-border-color:red");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

    }

}
