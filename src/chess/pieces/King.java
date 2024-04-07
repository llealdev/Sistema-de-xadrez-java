
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.EnumColor;


public class King extends ChessPiece {

    public King(EnumColor color, Board board) {
        super(color, board);
    }
   
    @Override
    public String toString(){
        return "K";
    }
}
