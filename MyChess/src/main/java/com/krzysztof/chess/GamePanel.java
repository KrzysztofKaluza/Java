package com.krzysztof.chess;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class GamePanel extends JPanel {

    private static final int DEFAULT_WIDTH = 1280;
    private static final int DEFAULT_HEIGHT = 720;

    private void initPanel(){

        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }

    public GamePanel(){
        initPanel();
    }
}
