package com.krzysztof.chess;
/**
 *  Player class contains information about a player
 */
public class Player {

    private final String name;
    private final Color color;
    private boolean isMoving;
    /**
     *  Constructor for a Player
     * @param name  name of a Player
     * @param color Player color on the board
     */
    public Player(String name, Color color){
        this.name = name;
        this.color = color;
    }

    /**
     * @return name of a Player
     */
    public String getName() {
        return name;
    }

    /**
     * @return color of a Player
     */
    public Color getColor() {
        return color;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean getIsMoving(){
        return this.isMoving;
    }
}
