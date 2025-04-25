package ChessLLD;



public class PawnMovementStrategy implements pieceMovementStrategy {
    @Override
    public boolean canMove(Board board, Cell StartCell, Cell EndCell) {
        int dx = StartCell.getPiece().getWhite() ? -1 : 1;
        return EndCell.getRow() == StartCell.getRow() + dx && StartCell.getCol() == EndCell.getCol();
    }
}
