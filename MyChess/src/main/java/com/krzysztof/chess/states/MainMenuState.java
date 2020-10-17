package com.krzysztof.chess.states;

import com.krzysztof.chess.GameGUI;

public class MainMenuState implements State{

    private double dt;
    private GameGUI gui;
    private short closeCounter;

    public MainMenuState(GameGUI gui){
        this.dt = dt;
        this.gui = gui;
        this.closeCounter = 0;
    }

    @Override
    public void endState() {


        if(this.closeCounter > 0){

        }
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void render() {

    }
}
