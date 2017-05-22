/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepermodel;

import java.util.List;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hailey.jones
 */
public class MineSweeperModel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Grid make = new Grid();
        GridPane grid = make.getGrid();
        List<Button> list = make.getList();

        Bomb bomb = new Bomb();
        List<Button> bombList = bomb.bomb(list);
        
        StackPane root = new StackPane();

        Scene scene = new Scene(root, 600, 600);
        root.getChildren().add(grid);
        primaryStage.setTitle("MineSweeper");
        primaryStage.setScene(scene);
        primaryStage.show();

        for (int i = 0; i < bombList.size(); i++) {
            Button get = bombList.get(i);
            
            get.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Image image = new Image("http://icons.iconarchive.com/icons/aha-soft/desktop-buffet/128/Pizza-icon.png", 50, 50, true, true);

                    ImageView imageView = new ImageView(image);
                    get.setGraphic(imageView);

                }

            });
        }
        boolean done = true;
        if (/* all squares marked*/done) {
            String message = "Congratulations you won!";
            Stage stage = new Stage();
            WinOrLose won = new WinOrLose();
            won.run(stage, message);
        } else if (/*bomb selected*/done) {

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
