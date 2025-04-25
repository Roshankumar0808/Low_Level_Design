package ChessLLD;

public class Bishop extends piece {
    public Bishop(boolean isWhitePiece) {
        super(isWhitePiece,new BishopMovementStrategy());
    }
}
