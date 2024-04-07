
package chess;

import boardgame.Board;
import boardgame.Piece;
import chess.EnumColor.Color;

public class ChessPiece extends Piece{
    
    private EnumColor color;

    public ChessPiece(EnumColor color, Board board) {
        super(board);
        this.color = color;
    }

    public EnumColor getColor() {
        return color;
    }
    
    
}
