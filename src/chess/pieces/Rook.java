
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.EnumColor;

public class Rook extends ChessPiece{

    public Rook(EnumColor color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
}
