package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {

    @Test
    void capture() {

    }

    @Test
    void isCaptured() {

    }

    @Test
    void getType() {
        King kingPiece = new King(4, 7, Color.WHITE);
        assertEquals(TypeOfPiece.KING, kingPiece.getType());
    }

    @Test
    void move() throws Exception {
        King kingPiece = new King(4, 7, Color.WHITE);
        kingPiece.move(Directions.NORTH, 1);
        assertEquals(4, kingPiece.getPiecePosition().get("x"));
        assertEquals(6, kingPiece.getPiecePosition().get("y"));

    }

    @Test
    void getColor() {
        King kingPiece = new King(4, 7, Color.WHITE);
        assertEquals(Color.WHITE, kingPiece.getColor());
    }

    @Test
    void getPosition() {
        King kingPiece = new King(4, 7, Color.WHITE);
        assertEquals(4, kingPiece.getPiecePosition().get("x"));
        assertEquals(7, kingPiece.getPiecePosition().get("y"));

    }

}