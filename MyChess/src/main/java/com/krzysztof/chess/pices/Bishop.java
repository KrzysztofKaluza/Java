package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

import java.util.Map;

public class Bishop implements Piece{
    private final TypeOfPiece type;
    private final Color color;
    private Map<String, Integer> piecePosition;

    public Bishop(int x_pos, int y_pos, Color color){
        this.type = TypeOfPiece.BISHOP;

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
        if(fields > 7){
            throw new Exception("EXCEPTION::FIELDS_VALUE::BISHOP");
        }
        switch (direction){
            case NORTH_EAST:
                this.piecePosition.put("x", this.piecePosition.get("x") + fields);
                this.piecePosition.put("y", this.piecePosition.get("y") - fields);
                break;
            case SOUTH_EAST:
                this.piecePosition.put("x", this.piecePosition.get("x") + fields);
                this.piecePosition.put("y", this.piecePosition.get("y") + fields);
                break;
            case SOUTH_WEST:
                this.piecePosition.put("x", this.piecePosition.get("x") - fields);
                this.piecePosition.put("y", this.piecePosition.get("y") + fields);
                break;
            case NORTH_WEST:
                this.piecePosition.put("x", this.piecePosition.get("x") - fields);
                this.piecePosition.put("y", this.piecePosition.get("y") - fields);
                break;
            default:
                throw new Exception("EXCEPTION::BAD_DIRECTION::BISHOP");
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
