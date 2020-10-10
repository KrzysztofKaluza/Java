package com.krzysztof.chess;

import com.krzysztof.chess.states.MainMenuState;
import com.krzysztof.chess.states.State;

import java.util.List;
import java.util.Vector;


public class Game {

    private double deltaTime;
    private double deltaTimeS;
    private double subtractTime;
    private GameGUI gui;
    private List<State> listOfStates;

    /**
     * Initializers
     */
    private void initVariables(){
        this.subtractTime = System.nanoTime();
        this.gui = new GameGUI();
        this.listOfStates = new Vector<>();
    }

    private void initStates(){
        this.listOfStates.add(new MainMenuState(this.deltaTimeS, this.gui));
    }

    public Game(){
        initVariables();
        initStates();
    }

    /**
     * Calculate delta time between loop transitions
     */
    public void updateDt(){
        this.deltaTime = System.nanoTime() - this.subtractTime;
        this.subtractTime = this.subtractTime + deltaTime;
        this.deltaTimeS = this.deltaTime/Math.pow(10, 9);
    }

    /**
     * update top state in stack
     */
    public void update(){

    }

    /**
     * render top state in stack
     */
    public void render(){


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
        initVariables();
        while(gui.getIsOpen()){
            updateDt();
            update();
            render();
        }
    }


    public static void main(String[] args){
        Game game = new Game();
        game.run();
    }



}
