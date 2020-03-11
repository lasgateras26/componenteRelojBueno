package com.alberto.test;

import com.alberto.componente.Reloj;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PruebaReloj extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        Reloj reloj = new Reloj();
        reloj.start();
        reloj.setFormato24h(true);
        vBox.getChildren().add(reloj);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
