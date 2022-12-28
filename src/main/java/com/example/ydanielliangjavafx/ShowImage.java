package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {

    @Override
    public  void start(Stage stage){

        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("image/us.gif");

        pane.getChildren().add(new ImageView(image));

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        pane.getChildren().add(imageView);


        ImageView imageView1 = new ImageView(image);
        imageView1.setRotate(90);
        pane.getChildren().add(imageView1);

        Scene scene = new Scene(pane);
        stage.setTitle("ShowImage");
        stage.setScene(scene);
        stage.show();


    }
}
