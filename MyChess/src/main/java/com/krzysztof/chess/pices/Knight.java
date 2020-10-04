package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

import java.util.Map;

public class Knight implements Piece{
    private final TypeOfPiece type;
    private final Color color;
    private Map<String, Integer> piecePosition;

    public Knight(int x_pos, int y_pos, Color color){
        this.type = TypeOfPiece.KNIGHT;

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
        return this.type;
    }

    @Override
    public void move(Directions direction, int fields) throws Exception {
        if(fields != 3){
            throw new Exception("EXCEPTION::FIELDS_VALUE::KNIGHT");
        }
        switch (direction){
            case NORTH:
                break;
            case NORTH_EAST:
                break;
            case EAST:
                break;
            case SOUTH_EAST:
                break;
            case SOUTH:
                break;
            case SOUTH_WEST:
                break;
            case WEST:
                break;
            case NORTH_WEST:
                break;
            default:
                throw new Exception("EXCEPTION::BAD_DIRECTION::KNIGHT");
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
