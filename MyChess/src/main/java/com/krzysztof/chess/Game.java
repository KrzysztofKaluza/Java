package com.krzysztof.chess;

import com.krzysztof.chess.states.AllStateNames;
import com.krzysztof.chess.states.MainMenuState;
import com.krzysztof.chess.states.State;

import javax.swing.*;
import java.util.EnumMap;


public class Game {
    private Timer timer;
    private double deltaTime;
    private double deltaTimeS;
    private double subtrahendTime;
    private GameGUI gui;
    private AllStateNames stateValue;
    private EnumMap<AllStateNames, State> states;
    /**
     * Initializers
     */
    private void initVariables(){
        this.subtrahendTime = System.nanoTime();
        this.gui = new GameGUI();
        this.states = new EnumMap<>(AllStateNames.class);
        this.stateValue = AllStateNames.MAIN_MENU_STATE;
        this.deltaTime = 0;
        this.deltaTimeS = 0;
    }

    private void initStates(){
        this.states.put(AllStateNames.MAIN_MENU_STATE,new MainMenuState(this, this.gui, this.deltaTimeS));
    }

    /**
     * Constructors
     */
    public Game(){
        initVariables();
        initStates();
    }

    /**
     * Calculate delta time between loop transitions
     */
    public void updateDt(){
        this.deltaTime = System.nanoTime() - this.subtrahendTime;
        this.subtrahendTime = this.subtrahendTime + deltaTime;
        this.deltaTimeS = this.deltaTime/Math.pow(10, 9);
    }

    /**
     * update top state in stack
     */
    public void update(){

        if(true) {
            this.states.get(this.stateValue).update(this.deltaTimeS);
        }
    }

    /**
     * render top state in stack
     */
    public void render(){

        if(true){
            this.states.get(this.stateValue).render();
        }

    }

    /**
     * @return double deltaTimeS - delta time between loop transitions in seconds
     */
    public double getDeltaTimeS(){
        return this.deltaTimeS;
    }

    /**
     * Main loop of application
     */
    public void run(){
        while(gui.getIsOpen()){
            updateDt();
            update();
            render();
        }
    }

    public void setStateValue(AllStateNames stateValue){
        this.stateValue = stateValue;
    }

    public static void main(String[] args){
        Game game = new Game();
        game.run();
    }



}
