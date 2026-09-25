package chessgame.pieces;

import chessgame.Board;
import chessgame.Color;

public class Bishop extends Piece {
    public Bishop(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        int rowDiff = Math.abs(destRow - row);
        int colDiff = Math.abs(destCol - col);
        return (rowDiff == colDiff);

        // Also need to check between row->destRow and col->destCol, is there any Piece of While or Black color? If yes then can't move it.
        // Is this correct understanding?
    }
}
