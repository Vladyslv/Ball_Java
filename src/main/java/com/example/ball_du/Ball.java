package com.example.ball_du;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Circle {
    double dx = 3;
    double dy = 3;
    boolean running = true;

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
        setFill(Color.BLUE);

        setOnMouseClicked(event -> {
            running = !running;
        });
    }

    public void move(double w, double h) {
        if (running == false) {
            return;
        }

        setCenterX(getCenterX() + dx);
        setCenterY(getCenterY() + dy);

        if (getCenterX() - getRadius() <= 0) {
            dx = Math.abs(dx);
        }
        if (getCenterX() + getRadius() >= w) {
            dx = -Math.abs(dx);
        }
        if (getCenterY() - getRadius() <= 0) {
            dy = Math.abs(dy);
        }
        if (getCenterY() + getRadius() >= h) {
            dy = -Math.abs(dy);
        }
    }

    public void faster() {
        dx = dx * 1.2;
        dy = dy * 1.2;
    }

    public void slower() {
        dx = dx / 1.2;
        dy = dy / 1.2;
    }
}