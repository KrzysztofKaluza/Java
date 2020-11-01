package com.krzysztof.chess.states;

import com.krzysztof.chess.Game;
import com.krzysztof.chess.GameGUI;

public class MainMenuState implements State{

    private double dt;
    private GameGUI gui;
    private short closeCounter;

    public MainMenuState(GameGUI gui, double dt, Game game){
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
        this.dt = dt;
    }

    @Override
    public void render() {

    }
}
