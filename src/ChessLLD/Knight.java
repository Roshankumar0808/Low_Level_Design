package ChessLLD;

public class Knight extends piece {
    public Knight(boolean isWhitePiece) {
        super(isWhitePiece,new KnightMovementStrategy());
    }
}
