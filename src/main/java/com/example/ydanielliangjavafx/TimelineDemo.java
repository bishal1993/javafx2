package com.example.ydanielliangjavafx;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.security.Key;

public class TimelineDemo extends Application {
    @Override
    public void start(Stage stage){
        StackPane stackPane = new StackPane();
        Text text = new Text(20,50,"Programming is fun");
        text.setFill(Color.RED);
        stackPane.getChildren().add(text);


        EventHandler<ActionEvent> eventEventHandler = e-> {
            if(text.getText().length()!=0){
                text.setText("");
            } else{
                text.setText("Programming is fun");
            }
        };

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(500),eventEventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        text.setOnMouseClicked(e->{
            if(animation.getStatus() == Animation.Status.PAUSED){
                animation.play();
            } else{
                animation.pause();
            }
        });

        Scene scene = new Scene(stackPane,250,250);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }
}
