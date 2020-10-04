package com.krzysztof.chess.pices;

import com.krzysztof.chess.Color;

import java.util.Map;

public class Rook implements Piece{
    private final TypeOfPiece type;
    private final Color color;
    private Map<String, Integer> piecePosition;

    public Rook(int x_pos, int y_pos, Color color){
        this.type = TypeOfPiece.ROOK;
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
            throw new Exception("EXCEPTION::FIELDS_VALUE::ROOK");
        }
        switch (direction){
            case NORTH:
                this.piecePosition.put("x", this.piecePosition.get("x"));
                this.piecePosition.put("y", this.piecePosition.get("y") - fields);
                break;
            case EAST:
                this.piecePosition.put("x", this.piecePosition.get("x") + fields);
                this.piecePosition.put("y", this.piecePosition.get("y"));
                break;
            case SOUTH:
                this.piecePosition.put("x", this.piecePosition.get("x"));
                this.piecePosition.put("y", this.piecePosition.get("y") + fields);
                break;
            case WEST:
                this.piecePosition.put("x", this.piecePosition.get("x") - fields);
                this.piecePosition.put("y", this.piecePosition.get("y"));
                break;
            default:
                throw new Exception("EXCEPTION::BAD_DIRECTION::ROOK");
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
