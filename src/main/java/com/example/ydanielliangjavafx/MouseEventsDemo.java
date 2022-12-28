package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventsDemo extends Application {
    @Override
    public  void start(Stage stage){
        Pane pane = new Pane();
        Text text = new Text(20,20,"Programming is fun!");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(e->{
            text.setX(e.getX());
            text.setY(e.getY());
        });
        Scene scene = new Scene(pane,300,100);
        stage.setScene(scene);
        stage.setTitle("MounseEventDemo");
        stage.show();


    }
}
