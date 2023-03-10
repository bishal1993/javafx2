package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
    @Override
    public void start(Stage stage){
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        gridPane.add(new Label("First Name: "), 0 , 0);
        gridPane.add(new TextField(),1,0);
        gridPane.add(new Label("MI: "),0,1);
        gridPane.add(new TextField(),1,1);
        gridPane.add(new Label("Last Name:"),0,2);
        gridPane.add(new TextField(),1,2);
        Button btAdd = new Button("Add Name");
        gridPane.add(btAdd,1,3);



        Scene scene = new Scene(gridPane);
        stage.setTitle("Show GridPane");
        stage.setScene(scene);
        stage.show();


    }
}
