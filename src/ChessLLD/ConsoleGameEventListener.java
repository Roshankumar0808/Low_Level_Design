package ChessLLD;

public class ConsoleGameEventListener implements GameEventListener{
    @Override
    public void onMoveMade(Move move) {
        System.out.println("Move made from: " + move.getStartCell().getlable() + " to " + move.getEndCell().getlable());

    }

    @Override
    public void onGameStateChanged(Status state) {
        System.out.println("Game state changed to: " + state);
    }
}
