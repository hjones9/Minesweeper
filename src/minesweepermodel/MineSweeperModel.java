/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepermodel;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
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

        Scene scene = new Scene(root, 1000, 1000);
        root.getChildren().add(grid);
        primaryStage.setTitle("MineSweeper");
        primaryStage.setScene(scene);
        primaryStage.show();

        for (int i = 0; i < bombList.size(); i++) {
            Button itsABomb = bombList.get(i);
            AtomicBoolean atomicReact = new AtomicBoolean(true);

            itsABomb.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {

                    if (event.getButton() == MouseButton.PRIMARY && atomicReact.get()) {
                        bomb.react(bombList);
                        String message = "You lost";
                        Stage stage = new Stage();
                        WinOrLose won = new WinOrLose();
                        try {
                            won.run(stage, message, grid);
                        } catch (Exception ex) {
                            Logger.getLogger(MineSweeperModel.class.getName()).log(Level.SEVERE, null, ex);

                        }

                    }

                }
            });

        }

        for (int i = 0; i < list.size(); i++) {
            Button get = list.get(i);

            get.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {

                    Image image2 = new Image("https://lh3.googleusercontent.com/quaYoevP5DEiig0JnRqjpYJ_T15T8as9ydPnMYOjRhGohBy8Lq40hIUEygXTF2o6XjpSAbE=s85", 25, 25, true, true);
                    ImageView imageView2 = new ImageView(image2);

                    if (event.getButton() == MouseButton.SECONDARY) {
                        get.setGraphic(imageView2);
                    }
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
