package com.krzysztof.chess.states;

import com.krzysztof.chess.Game;
import com.krzysztof.chess.GameGUI;

public class SubMenuState implements State {

    private double dt;
    private GameGUI gui;
    private short closeCounter;

    public SubMenuState(Game game, GameGUI gui, double dt){
        this.dt = dt;
        this.gui = gui;
        this.closeCounter = 0;
    }

    @Override
    public void endState() {

    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void render() {

    }
}
