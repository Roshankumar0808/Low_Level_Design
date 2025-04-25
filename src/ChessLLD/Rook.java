package ChessLLD;

public class Rook extends piece {
    public Rook(boolean isWhitePiece) {
        super(isWhitePiece,new RookMovementStrategy());
    }
}
