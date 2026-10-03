package com.example.finalproject1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startForm.fxml"));
        this.stage = stage;
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeScene(String file) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(file+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 330, 550);
            stage.setScene(scene);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("failed to load scene file");
        }
    }
    public static void changeScene2(String file) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(file+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 400);
            stage.setScene(scene);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("failed to load scene file");
        }
    }
    public static void changeScene3(String file) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(file+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setScene(scene);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("failed to load scene file");
        }
    }

}