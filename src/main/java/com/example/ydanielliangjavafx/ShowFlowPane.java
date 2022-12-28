package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {

    @Override
    public void start(Stage stage){
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(11,12,13,14));
        flowPane.setHgap(15);
        flowPane.setVgap(15);

        flowPane.getChildren().addAll(new Label("First Name :"),new TextField(),new Label("MI:"));
        TextField textField = new TextField();
        textField.setPrefColumnCount(1);
        flowPane.getChildren().addAll(textField,new Label("Last Name:"), new TextField());


        Scene scene = new Scene(flowPane,250,200);
        stage.setScene(scene);
        stage.setTitle("Show FlowPane");
        stage.show();
    }
}
