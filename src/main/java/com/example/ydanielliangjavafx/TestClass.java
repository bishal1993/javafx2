package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestClass extends Application {
    @Override
    public void start(Stage primaryStage){
        System.out.println("Start method  is invoked");

    }

    public void test(){
        System.out.println("Test Constructor is invoked");
    }

    public static  void main(String [] args){
        System.out.println("launch Application");
        Application.launch(args);
        System.out.println("launch Application1 ");

    }
}
