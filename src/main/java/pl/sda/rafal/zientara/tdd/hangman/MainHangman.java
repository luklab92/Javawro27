package pl.sda.rafal.zientara.tdd.hangman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import pl.sda.rafal.zientara.tdd.programowanie2.lesson1.CalcController;

import java.util.Scanner;

public class MainHangman  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass()
                .getResource("/hangMan.fxml"));
        AnchorPane anchorPane = loader.load();
        HangManController controller = loader.getController();
        primaryStage.setTitle("Calc");
        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
