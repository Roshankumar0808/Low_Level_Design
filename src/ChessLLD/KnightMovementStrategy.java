package ChessLLD;

public class KnightMovementStrategy implements pieceMovementStrategy {
    @Override
    public boolean canMove(Board board, Cell StartCell, Cell EndCell) {
        int dx=Math.abs(StartCell.getRow()- EndCell.getRow());
        int dy=Math.abs(EndCell.getRow()- EndCell.getCol());
        return ((dx==2&&dy==1)||(dx==1&&dy==2));
    }
}
