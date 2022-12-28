package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ResizableCircleRectangle extends Application {
    private Circle circle = new Circle(60);
    private Rectangle rectangle = new Rectangle(120,120);
    private StackPane stackPane = new StackPane();

    @Override
    public void start(Stage stage){
        circle.setFill(Color.GRAY);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        stackPane.getChildren().addAll(rectangle,circle);


        Scene scene = new Scene(stackPane,140,140);
        stage.setScene(scene);
        stage.setTitle("Resizablecirclerectange");
        stage.show();

        stackPane.widthProperty().addListener(ov->resize());
        stackPane.heightProperty().addListener(observable -> resize());
    }

    private void resize(){
        double length = Math.min(stackPane.getWidth(), stackPane.getHeight());
        circle.setRadius(length/2-15);
        rectangle.setWidth(length-30);
        rectangle.setHeight(length-30);

    }
}
