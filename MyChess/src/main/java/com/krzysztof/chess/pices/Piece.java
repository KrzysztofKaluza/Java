package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

public interface Piece {

    void capture();
    void isCaptured();
    TypeOfPiece getType();
    void move();
    Color getColor();

}
