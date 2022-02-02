package com.pwdgenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

/*
    ____               ________                           __
   / __ \_      ______/ / ____/__  ____  ___  _________ _/ /_____  _____
  / /_/ / | /| / / __  / / __/ _ \/ __ \/ _ \/ ___/ __ `/ __/ __ \/ ___/
 / ____/| |/ |/ / /_/ / /_/ /  __/ / / /  __/ /  / /_/ / /_/ /_/ / /
/_/     |__/|__/\__,_/\____/\___/_/ /_/\___/_/   \__,_/\__/\____/_/


 */
public class PwdGenerator extends Application {
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        FXMLLoader fxmlLoader = new FXMLLoader(PwdGenerator.class.getResource("view.fxml"));
        Parent root = fxmlLoader.load();
        Button b = (Button) root.lookup("#copy");
        ImageView imageView = new ImageView(new Image("https://img.icons8.com/material-rounded/24/000000/copy.png"));
        b.setGraphic(imageView);
        Scene scene = new Scene(root);
        stage.setTitle("PwdGenerator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}