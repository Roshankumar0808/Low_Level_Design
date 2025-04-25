package ChessLLD;

public class Pawn extends piece {
    public Pawn(boolean isWhitePiece) {
        super(isWhitePiece,new PawnMovementStrategy());
    }
}
