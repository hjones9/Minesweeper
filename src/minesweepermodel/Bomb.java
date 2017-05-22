/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepermodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.scene.control.Button;

/**
 *
 * @author Hailey.Jones
 */
public class Bomb {

    List<Button> bombList = new ArrayList<>();

    List<Button> bomb(List<Button> list) {
        List<Integer> repeat = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int x = random.nextInt(list.size() - 1) + 1;

            boolean again = false;
            if (i != 0) {
                for (int check : repeat) {
                    if (check == x) {
                        i--;
                        again = true;
                    }
                }
            }
            if (!again) {
                bombList.add(list.get(x));
                repeat.add(x);
            }

        }
        return bombList;
    }
}
