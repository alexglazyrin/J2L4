package ru.gb.lesson4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Chat extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Chat.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 300);
        stage.setTitle("Чат");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}