package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

public interface Piece {

    void capture();
    void isCaptured();
    TypeOfPiece getType();
    void move(Directions direction, int fields) throws Exception;
    Color getColor();

}
