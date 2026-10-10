module com.example.ball_du {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ball_du to javafx.fxml;
    exports com.example.ball_du;
}