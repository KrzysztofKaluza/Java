package com.krzysztof.chess.pices;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MovementTest {

    @Test
    void moveN() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.NORTH, 3);
        assertArrayEquals(new int[]{0, -3}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveNE() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.NORTH_EAST, 3);
        assertArrayEquals(new int[]{3, -3}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveE() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.EAST, 3);
        assertArrayEquals(new int[]{3, 0}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveSE() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.SOUTH_EAST, 3);
        assertArrayEquals(new int[]{3, 3}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveS() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.SOUTH, 3);
        assertArrayEquals(new int[]{0, 3}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveSW() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.SOUTH_WEST, 3);
        assertArrayEquals(new int[]{-3, 3}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveW() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.WEST, 3);
        assertArrayEquals(new int[]{-3, 0}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveNW() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.move(piecePosition, Directions.NORTH_WEST, 3);
        assertArrayEquals(new int[]{-3, -3}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});

    }

    @Test
    void moveKnightN() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.NORTH);
        assertArrayEquals(new int[]{1, -2}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }

    @Test
    void moveKnightNE() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.NORTH_EAST);
        assertArrayEquals(new int[]{2, -1}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }

    @Test
    void moveKnightE() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.EAST);
        assertArrayEquals(new int[]{2, 1}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }

    @Test
    void moveKnightSE() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.SOUTH_EAST);
        assertArrayEquals(new int[]{1, 2}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }

    @Test
    void moveKnightS() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.SOUTH);
        assertArrayEquals(new int[]{-1, 2}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }

    @Test
    void moveKnightSW() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.SOUTH_WEST);
        assertArrayEquals(new int[]{-2, 1}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }

    @Test
    void moveKnightW() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.WEST);
        assertArrayEquals(new int[]{-2, -1}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }

    @Test
    void moveKnightNW() {
        Map<String, Integer> piecePosition = new HashMap<>();
        piecePosition.put("x", 0);
        piecePosition.put("y", 0);
        Map<String, Integer> newPiecePosition = Movement.moveKnight(piecePosition, Directions.NORTH_WEST);
        assertArrayEquals(new int[]{-1, -2}, new int[]{newPiecePosition.get("x"), newPiecePosition.get("y")});
    }
}