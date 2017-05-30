/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepermodel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Hailey.Jones
 */
public class WinOrLose {

    public void run(Stage primaryStage, String message, GridPane grid) throws Exception {
        
        Text text = new Text(message);
        Button btn = new Button();
        btn.setText("Play Again");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                MineSweeperModel again = new MineSweeperModel();
                try {
                    again.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(WinOrLose.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Button button = new Button();
        button.setText("Exit");
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        btn.setLayoutX(70);
        btn.setLayoutY(130);
        
        button.setLayoutX(190);
        button.setLayoutY(130);
        
        text.setLayoutX(80);
        text.setLayoutY(80);
        
        Pane root = new Pane();
        root.getChildren().addAll(button, btn, text);


        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Political Minesweeper");
        primaryStage.setScene(scene);
        primaryStage.show();
        grid.setDisable(true);
    }

}
