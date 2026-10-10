package com.example.ball_du;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private AnchorPane pane;

    private Ball ball;

    @FXML
    public void initialize() {
        ball = new Ball(60, 60, 25);
        pane.getChildren().add(ball);

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                ball.move(pane.getWidth(), pane.getHeight());
            }
        };
        timer.start();
    }

    public void keyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.F) {
            ball.faster();
        }
        if (event.getCode() == KeyCode.S) {
            ball.slower();
        }
    }
}