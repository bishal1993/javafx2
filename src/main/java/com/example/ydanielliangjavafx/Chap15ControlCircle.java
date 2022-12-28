package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Chap15ControlCircle extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage stage){

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btnEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");

        hBox.getChildren().add(btnEnlarge);
        hBox.getChildren().add(btShrink);

        btnEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHandler());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER);

        Scene scene = new Scene(borderPane,200,150);
        stage.setScene(scene);
        stage.setTitle("Controlcircle");
        stage.show();



    }
    class EnlargeHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            circlePane.enlarge();
        }
}
class  ShrinkHandler implements  EventHandler<ActionEvent>{
        @Override
    public  void handle(ActionEvent actionEvent){
            circlePane.shrink();
        }
}

class  CirclePane extends StackPane{
private Circle circle = new Circle(50);

public CirclePane(){
    getChildren().add(circle);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
}

public void enlarge(){
    circle.setRadius(circle.getRadius()+2);
}
public void shrink(){
    circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() -2:circle.getRadius());
}
}

}