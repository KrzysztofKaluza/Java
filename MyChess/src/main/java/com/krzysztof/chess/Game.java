package com.krzysztof.chess;

import com.krzysztof.chess.states.AllStateNames;
import com.krzysztof.chess.states.MainMenuState;
import com.krzysztof.chess.states.State;

import java.util.EnumMap;
import java.util.Stack;


public class Game {

    private double deltaTime;
    private double deltaTimeS;
    private double subtrahendTime;
    private GameGUI gui;
    //private Stack<State> states;
    private AllStateNames stateValue;
    private EnumMap<AllStateNames, State> states1;
    /**
     * Initializers
     */
    private void initVariables(){
        this.subtrahendTime = System.nanoTime();
        this.gui = new GameGUI();
        this.states1 = new EnumMap<>(AllStateNames.class);
        //this.states = new Stack<>();
        this.stateValue = AllStateNames.MAIN_MENU_STATE;
        this.deltaTime = 0;
        this.deltaTimeS = 0;
    }

    private void initStates(){
        //this.states.push(new MainMenuState(this.gui, this.deltaTimeS));
        this.states1.put(AllStateNames.MAIN_MENU_STATE,new MainMenuState(this.gui, this.deltaTimeS, this));
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

        if(/*!this.states.empty()*/true) {
            this.states1.get(this.stateValue).update(this.deltaTimeS);
            //this.states.peek().update(this.deltaTimeS);
        }
    }

    /**
     * render top state in stack
     */
    public void render(){

        if(/*!this.states.empty()*/true){
            //this.states.peek().render();
            this.states1.get(this.stateValue).render();
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
