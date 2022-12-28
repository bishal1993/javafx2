package com.example.ydanielliangjavafx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockAnimation extends Application {
    @Override
    public void start(Stage stage){
        ClockPane clockPane = new ClockPane();

        EventHandler<ActionEvent> eventEventHandler = e->{
            clockPane.setCurrentime();
        };

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventEventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(clockPane,250,50);
        stage.setTitle("ClockAnimation");
        stage.setScene(scene);
        stage.show();



    }
}
