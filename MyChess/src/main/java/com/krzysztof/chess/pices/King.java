package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

import java.util.HashMap;
import java.util.Map;

public class King implements Piece{
    private final TypeOfPiece type;
    private final Color color;
    private Map<String, Integer> position;

    public King(int x_pos, int y_pos, Color color){
        this.type = TypeOfPiece.KING;
        assert this.position != null;
        this.position.put("x", x_pos);
        this.position.put("y", y_pos);
        this.color = color;
    }

    @Override
    public void capture() {

    }

    @Override
    public void isCaptured() {

    }

    @Override
    public TypeOfPiece getType() {
        return this.type;
    }

    @Override
    public void move() {

    }

    @Override
    public Color getColor() {
        return color;
    }

    public Map<String, Integer> getPosition() {
        return position;
    }
}
