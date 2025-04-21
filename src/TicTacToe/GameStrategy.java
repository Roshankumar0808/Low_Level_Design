package TicTacToe;

public interface GameStrategy {


    void next(GameContext context);
    boolean isGameOver();
}
