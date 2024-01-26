package com.switchc4se.texttobinary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TextToBinary extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TextToBinary.class.getResource("texttobinary.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        AnchorPane root = fxmlLoader.getRoot();
        stage.setWidth(root.getPrefWidth()+25);
        stage.setHeight(root.getPrefHeight()+25);

        stage.setTitle("Text to binary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
