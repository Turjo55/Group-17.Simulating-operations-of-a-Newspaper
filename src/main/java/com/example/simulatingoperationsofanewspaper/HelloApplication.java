package com.example.simulatingoperationsofanewspaper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String fxmlPath = "/com/example/simulatingoperationsofanewspaper/TanvirulADMIN/HandlingUserComplaints.fxml";
        System.out.println("Loading FXML from: " + fxmlPath);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("HandlingUserComplaints");
        stage.setScene(scene);
        stage.show();
    }    public static void main(String[] args) {
        launch();
    }
}