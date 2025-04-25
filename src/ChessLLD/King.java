package ChessLLD;

public class King extends piece{
    public King(boolean white) {
        super(white, new KingMovementStrategy());
    }

}
