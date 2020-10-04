package com.krzysztof.chess;

import javax.swing.*;


public class Game {

    public static void main(String[] args){
        Game game = new Game();
        game.run();
    }

    public void run(){
        GameGUI gui = new GameGUI();
        while(gui.getIsOpen()){

        }
    }

}
