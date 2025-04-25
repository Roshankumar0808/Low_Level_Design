package ChessLLD;

public class Queen extends piece {
    public Queen(boolean isWhitePiece) {
        super(isWhitePiece,new QueenMovementStrategy());
    }
}
