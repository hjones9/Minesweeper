/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepermodel;

import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Hailey.Jones
 */
public class Grid {

    public List<Button> list = new ArrayList<>();
    public GridPane grid = new GridPane();

    public Grid() {
        for (int i = 0; i <= 10; i++) {
            for (int x = 0; x <= 10; x++) {
                Button button = new Button();
                button.setMinWidth(50);
                button.setMinHeight(50);
                button.setPadding(new Insets(0));
                grid.add(button, i, x);
                list.add(button);
            }
        }
    }

    public GridPane getGrid() {
        return grid;

    }

    public List<Button> getList() {
        return list;

    }

}
