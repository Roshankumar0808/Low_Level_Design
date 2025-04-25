package ChessLLD;



public class KingMovementStrategy implements pieceMovementStrategy{
    @Override
    public boolean canMove(Board board, Cell StartCell, Cell EndCell) {
        int dx=Math.abs(StartCell.getRow()-EndCell.getRow());
        int dy=Math.abs(StartCell.getRow()-EndCell.getRow());
        return (dx<=1&&dy<=1);
    }
}
