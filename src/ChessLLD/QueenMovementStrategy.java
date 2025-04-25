package ChessLLD;


public class QueenMovementStrategy implements pieceMovementStrategy{
    @Override
    public boolean canMove(Board board, Cell StartCell, Cell EndCell) {
        int dx=Math.abs(StartCell.getRow()- EndCell.getRow());
        int dy=Math.abs(StartCell.getCol()- EndCell.getCol());
        return dx==dy||StartCell.getRow()== EndCell.getRow()||StartCell.getCol()== EndCell.getCol();
    }
}
