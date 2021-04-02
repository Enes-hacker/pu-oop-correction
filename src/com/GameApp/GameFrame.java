package com.GameApp;

import java.awt.*;
public class GameFrame {
    public static final int TILE_SIZE = 100;
    private int row;
    private int col;
    private int tileSize;


    public GameFrame(int row, int col) {


        this.row        = row;
        this.col        = col;
        this.tileSize   = 100;

    }



    public void render(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        if(this.row % 2 == 0) {
            g.setColor(Color.BLACK);
        }
        else {
            g.setColor(Color.LIGHT_GRAY);
        }

        g.fillRect(tileX,tileY,this.tileSize, this.tileSize);

        if(this.col % 2 == 0) {
            g.setColor(Color.BLACK);
        }
        else {
            g.setColor(Color.LIGHT_GRAY);
        }

        g.fillRect(tileX,tileY,this.tileSize, this.tileSize);

    }
}