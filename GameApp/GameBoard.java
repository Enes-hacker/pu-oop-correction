package com.GameApp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame {
    private ArrayList<Object> pieceCollection;

    public GameBoard() {
        this.setSize(1200, 1200);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("MonsterApp");

    }
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for(int row = 0; row < 12; row++) {
            for(int col = 0; col < 12; col++) {

                GameFrame tile = new GameFrame(row, col);
                tile.render(g);




            }
        }
    }

}
