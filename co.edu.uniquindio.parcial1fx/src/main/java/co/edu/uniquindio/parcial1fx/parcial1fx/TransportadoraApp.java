package co.edu.uniquindio.parcial1fx.parcial1fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TransportadoraApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TransportadoraApp.class.getResource("formulariosCrud.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Transportadora");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}