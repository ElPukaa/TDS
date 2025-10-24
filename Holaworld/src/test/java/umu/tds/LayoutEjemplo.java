package umu.tds;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutEjemplo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button boton1 = new Button("Botón 1");
        Button boton2 = new Button("Botón 2");
        Button boton3 = new Button("Botón 3");
        Button boton4 = new Button("Botón 4");
        Button boton5 = new Button("Botón 5");
        
        BorderPane bpane = new BorderPane();
        bpane.setTop(boton1);
        bpane.setLeft(boton1);
        bpane.setCenter(boton1);
        bpane.setRight(boton1);
        bpane.setBottom(boton1);
        

        // Layout horizontal
        // con separación de 10px
        HBox hbox = new HBox(10); 
        hbox.getChildren().addAll(boton1, boton2);

        // Layout vertical
        VBox vbox = new VBox(15); 
        vbox.getChildren().addAll(hbox, boton3);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Layouts en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}