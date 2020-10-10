package com.krzysztof.chess.states;

import com.krzysztof.chess.GameGUI;

public class MainMenuState implements State{

    private double dt;
    private GameGUI gui;

    public MainMenuState(double dt ,GameGUI gui){
        this.dt = dt;
        this.gui = gui;
    }

    @Override
    public void endState() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render() {

    }
}
