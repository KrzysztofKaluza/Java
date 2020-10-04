package com.krzysztof.chess.pices;

import java.util.Map;

public class Movement{

    public static Map move(Map<String, Integer> piecePosition, Directions direction, int fields){
        assert piecePosition != null;
        switch (direction){
            case NORTH:
                piecePosition.put("x", piecePosition.get("x"));
                piecePosition.put("y", piecePosition.get("y") - fields);
                break;
            case NORTH_EAST:
                piecePosition.put("x", piecePosition.get("x") + fields);
                piecePosition.put("y", piecePosition.get("y") - fields);
                break;
            case EAST:
                piecePosition.put("x", piecePosition.get("x") + fields);
                piecePosition.put("y", piecePosition.get("y"));
                break;
            case SOUTH_EAST:
                piecePosition.put("x", piecePosition.get("x") + fields);
                piecePosition.put("y", piecePosition.get("y") + fields);
                break;
            case SOUTH:
                piecePosition.put("x", piecePosition.get("x"));
                piecePosition.put("y", piecePosition.get("y") + fields);
                break;
            case SOUTH_WEST:
                piecePosition.put("x", piecePosition.get("x") - fields);
                piecePosition.put("y", piecePosition.get("y") + fields);
                break;
            case WEST:
                piecePosition.put("x", piecePosition.get("x") - fields);
                piecePosition.put("y", piecePosition.get("y"));
                break;
            case NORTH_WEST:
                piecePosition.put("x", piecePosition.get("x") - fields);
                piecePosition.put("y", piecePosition.get("y") - fields);
                break;
            default:
                break;
        }
        return piecePosition;
    }
    public static Map moveKnight(Map<String, Integer> piecePosition, Directions direction){
        assert piecePosition != null;
        switch (direction){
            case NORTH:
                piecePosition.put("x", piecePosition.get("x") + 1);
                piecePosition.put("y", piecePosition.get("y") - 2);
                break;
            case NORTH_EAST:
                piecePosition.put("x", piecePosition.get("x") + 2);
                piecePosition.put("y", piecePosition.get("y") - 1);
                break;
            case EAST:
                piecePosition.put("x", piecePosition.get("x") + 2);
                piecePosition.put("y", piecePosition.get("y") + 1);
                break;
            case SOUTH_EAST:
                piecePosition.put("x", piecePosition.get("x") + 1);
                piecePosition.put("y", piecePosition.get("y") + 2);
                break;
            case SOUTH:
                piecePosition.put("x", piecePosition.get("x") - 1);
                piecePosition.put("y", piecePosition.get("y") + 2);
                break;
            case SOUTH_WEST:
                piecePosition.put("x", piecePosition.get("x") - 2);
                piecePosition.put("y", piecePosition.get("y") + 1);
                break;
            case WEST:
                piecePosition.put("x", piecePosition.get("x") - 2);
                piecePosition.put("y", piecePosition.get("y") - 1);
                break;
            case NORTH_WEST:
                piecePosition.put("x", piecePosition.get("x") - 1);
                piecePosition.put("y", piecePosition.get("y") - 2);
                break;
            default:
                break;
        }

        return piecePosition;
    }

}
