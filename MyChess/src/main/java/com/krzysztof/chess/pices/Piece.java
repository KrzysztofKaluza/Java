package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

public interface Piece {

    /**
     * Handles capturing other piece
     */
    void capture();

    /**
     * Handles being Captured (?)
     */
    void isCaptured();

    /**
     * @return type of a Piece
     */
    TypeOfPiece getType();

    /**
     * It changes position of a piece
     * @param direction one of directions based on enum type Directions
     * @param fields how many fields should Piece move
     */
    void move(Directions direction, int fields) throws Exception;

    /**
     * @return color of a Piece
     */
    Color getColor();

}
