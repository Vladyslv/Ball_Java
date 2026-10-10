package com.example.ball_du;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        HelloController controller = fxmlLoader.getController();
        scene.setOnKeyPressed(event -> controller.keyPressed(event));
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
