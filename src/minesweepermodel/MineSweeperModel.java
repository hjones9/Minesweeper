/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepermodel;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hailey.jones
 */
public class MineSweeperModel extends Application {

    //Matrix? lots of boxes?
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

//        Button button = new Button();
//        button.setText("I do nothing.");
//
//        button.setStyle("-fx-background-color: #090a0c ");
//        button.setMinWidth(200);
        
        ToggleButton TB = new ToggleButton("pizza");

        TB.setMaxWidth(100);

        List<Button> list = new ArrayList<>();

        int count = 0;

//        for(int i = 0; i<9; i++){
//        ToggleButton another = new ToggleButton("pizza", imageView);
//        count++;
//        another.setMaxSize(100, 100);
//        list.add(another);
//        
//        }
        VBox hbox = new VBox();

        hbox.getChildren().addAll(TB);

        GridPane grid = new GridPane();
        for (int i = 0; i <= 10; i++) {
            for (int x = 0; x <= 10; x++) {
                Button button = new Button();
                button.setMinWidth(20);
                grid.add(button, i, x);
                list.add(button);
            }
        }
        StackPane root = new StackPane();

        Scene scene = new Scene(root, 600, 600);
        root.getChildren().add(grid);
        primaryStage.setTitle("MineSweeper");
        primaryStage.setScene(scene);
        primaryStage.show();

        for (int i = 0; i < 100; i++) {
            Button get = list.get(i);
            get.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Image image = new Image("http://icons.iconarchive.com/icons/aha-soft/desktop-buffet/128/Pizza-icon.png");
        ImageView imageView = new ImageView(image);
                    get.setGraphic(imageView);

                }

            });
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
