package com.example.ydanielliangjavafx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BouncingBall extends Pane {
    public final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x, y, radius);

    private Timeline animation;

    public BouncingBall() {
        circle.setFill(Color.GREEN);
        getChildren().add(circle);
        animation = new Timeline(
                new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();


    }


    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    public void pause(){
        animation.pause();
    }

    public Timeline getTimeline() {
        return animation;
    }

    public void setTimeline(Timeline timeline) {
        this.animation = timeline;
    }

    protected void moveBall() {
        if (x < radius || x > getWidth() - radius) {
            dx *= -1;
        }
        if (y < radius || y > getHeight() - radius) {
            dy *= -1;
        }

        x += dx;
        y += dy;

        circle.setCenterX(x);
        circle.setCenterY(y);
    }
}
