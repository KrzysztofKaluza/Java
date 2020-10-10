package com.krzysztof.chess.states;

public interface State {

    public void endState();

    public void update();
    public void render();

}
