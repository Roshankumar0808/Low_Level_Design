package ChessLLD;

public interface GameEventListener {
    void onMoveMade(Move move);
    void onGameStateChanged(Status state);
}
