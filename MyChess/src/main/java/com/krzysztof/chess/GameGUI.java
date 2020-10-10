package com.krzysztof.chess;


import javax.swing.*;

public class GameGUI extends JFrame {

    private boolean isOpen;

    public GameGUI(){
        this.InitWindow();
    }

    public void InitWindow(){
        this.isOpen = true;
        this.setDefaultCloseOperation(GameGUI.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1280, 720);
        this.setTitle("Why not?!");
    }

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

    public boolean getIsOpen(){
        return this.isOpen;
    }

    public void render(){}

    public void update(){}


}
