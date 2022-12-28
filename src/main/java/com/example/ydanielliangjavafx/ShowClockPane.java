package com.example.ydanielliangjavafx;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowClockPane extends Application {
    @Override
    public void start(Stage stage) {
        ClockPane clockPane = new ClockPane();
    }
}

class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    public ClockPane() {
        setCurrentime();
    }

    public void setCurrentime() {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
        paintClock();
    }

    private void paintClock() {
    double clockRadius = Math.min(getWidth(),getHeight() )* 0.8*0.5;
    double centerX = getWidth()/2;
    double centerY = getHeight() /2 ;



    }


}