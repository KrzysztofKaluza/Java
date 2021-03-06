package com.krzysztof.chess;


import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class GameGUI extends JFrame {

    public GamePanel gamePanel;

    private boolean isOpen;

    public void InitWindow(){
        this.isOpen = true;
        this.setDefaultCloseOperation(GameGUI.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setSize(1280, 720);
        this.setTitle("Chess");
    }

    public GameGUI(){
        this.gamePanel = new GamePanel();
        this.InitWindow();
        buildGUI();
    }

    // TEMPORARY METHOD
    private void buildGUI(){
        add(gamePanel);
        pack();
    }

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

    public boolean getIsOpen(){
        return this.isOpen;
    }

    public void render(){

    }

    public void update(){}


}
