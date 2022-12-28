package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowText extends Application {
    @Override
    public void start(Stage stage){
        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));
        Text text = new Text(20,20,"Programming is fun");
        text.setFont(Font.font("Courier ", FontWeight.BLACK, FontPosture.ITALIC,15));
        pane.getChildren().add(text);

        Text text1 = new Text(60,60,"Programming is fun\nDisplay text");
        pane.getChildren().add(text1);

        Text text2 = new Text(10,100,"Programming is fun\nDisplay text");
        text2.setFill(Color.RED);
        text2.setUnderline(true);
        text2.setStrikethrough(true);
        pane.getChildren().add(text2);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Show text");
        stage.show();


    }
}
