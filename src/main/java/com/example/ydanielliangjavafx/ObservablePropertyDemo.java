package com.example.ydanielliangjavafx;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {
    public static void main(String [] args){
        DoubleProperty doubleProperty = new SimpleDoubleProperty();
        doubleProperty.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            System.out.println("The new value is "+ doubleProperty.doubleValue());
            }
        });
        doubleProperty.set(4.5);
    }
}
