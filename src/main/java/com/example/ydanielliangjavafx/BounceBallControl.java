package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BounceBallControl extends Application {
    @Override
    public void start(Stage stage){
        BouncingBall bouncingBall = new BouncingBall();

        bouncingBall.setOnMousePressed(e->bouncingBall.pause());
        bouncingBall.setOnMouseReleased(e->bouncingBall.moveBall());

        Scene scene = new Scene(bouncingBall,250,150);
        stage.setTitle("BaounceBallControl");
        stage.setScene(scene);
        stage.show();
    }
}
