package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Chap15HandleEvent extends Application {
    @Override
    public void start(Stage stage){
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOk = new Button("OK");
        Button btCancel = new Button("Cancel");

        OKHanlderClass okHanlderClass = new OKHanlderClass();
        btOk.setOnAction(okHanlderClass);

        CancelHandlerClass cancelHandlerClass = new CancelHandlerClass();
        btCancel.setOnAction(cancelHandlerClass);

        Scene scene = new Scene(pane);
        stage.setTitle("Eventhandler");
        stage.setScene(scene);
        stage.show();



        pane.getChildren().addAll(btOk,btCancel);


    }
}

class OKHanlderClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvents) {
        System.out.println("Ok Button clicked.");

    }
}

class CancelHandlerClass implements  EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent e){
     System.out.println("Cancel button clicked");
    }




}