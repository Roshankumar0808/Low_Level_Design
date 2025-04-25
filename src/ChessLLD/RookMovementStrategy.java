package ChessLLD;


public class RookMovementStrategy implements pieceMovementStrategy {
    @Override
    public boolean canMove(Board board, Cell StartCell, Cell EndCell) {
        return StartCell.getRow() == EndCell.getRow() || StartCell.getCol() == EndCell.getCol();
    }
}
