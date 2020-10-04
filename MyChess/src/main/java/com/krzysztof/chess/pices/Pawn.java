package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

import java.util.Arrays;
import java.util.Map;

public class Pawn implements Piece{

    private final TypeOfPiece type;
    private final Color color;
    private Map<String, Integer> piecePosition;

    public Pawn(int x_pos, int y_pos, Color color){
        this.type = TypeOfPiece.PAWN;
        this.piecePosition.put("x", x_pos);
        this.piecePosition.put("y", y_pos);
        assert this.piecePosition != null;
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
        return null;
    }

    @Override
    public void move(Directions direction, int fields) throws Exception{
        if(fields != 1){
            throw new Exception("EXCEPTION::FIELDS_VALUE::PAWN");
        }
        if(this.color == Color.WHITE){
            if(!Arrays.asList(Directions.NORTH, Directions.NORTH_EAST, Directions.NORTH_WEST).contains(direction)){
                throw new Exception("EXCEPTION::WRONG_DIRECTION::PAWN");
            }
            Map<String, Integer> newPosition = Movement.move(this.piecePosition, direction, fields);
            this.piecePosition.replace("x", newPosition.get("x"));
            this.piecePosition.replace("y", newPosition.get("y"));

        }
        else{
            if(!Arrays.asList(Directions.SOUTH_EAST, Directions.SOUTH, Directions.SOUTH_WEST).contains(direction)){
                throw new Exception("EXCEPTION::WRONG_DIRECTION::PAWN");
            }
            Map<String, Integer> newPosition = Movement.move(this.piecePosition, direction, fields);
            this.piecePosition.replace("x", newPosition.get("x"));
            this.piecePosition.replace("y", newPosition.get("y"));
        }

    }

    @Override
    public Color getColor() {
        return null;
    }

    public Map<String, Integer> getPiecePosition() {
        return piecePosition;
    }
}
