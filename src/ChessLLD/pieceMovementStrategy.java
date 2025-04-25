package ChessLLD;



public interface pieceMovementStrategy {
    boolean canMove(Board board,Cell StartCell,Cell EndCell);
}
