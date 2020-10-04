package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rook implements Piece{
    private final TypeOfPiece type;
    private final Color color;
    private Map<String, Integer> piecePosition;

    public Rook(int x_pos, int y_pos, Color color){
        this.type = TypeOfPiece.ROOK;
        piecePosition = new HashMap<>();
        this.piecePosition.put("x", x_pos);
        this.piecePosition.put("y", y_pos);
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
    public void move(Directions direction, int fields) throws Exception{
        if(fields > 7){
            throw new Exception("EXCEPTION::FIELDS_VALUE::ROOK");
        }
        if(!Arrays.asList(Directions.NORTH, Directions.EAST, Directions.SOUTH, Directions.WEST).contains(direction)){
            throw new Exception("EXCEPTION::WRONG_DIRECTION::ROOK");
        }
        Map<String, Integer> newPosition = Movement.move(this.piecePosition, direction, fields);
        this.piecePosition.replace("x", newPosition.get("x"));
        this.piecePosition.replace("y", newPosition.get("y"));
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public Map<String, Integer> getPiecePosition() {
        return piecePosition;
    }
}
