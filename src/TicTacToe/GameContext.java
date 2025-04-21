package TicTacToe;

public class GameContext {
    private GameStrategy currentState;

    public GameContext() {
        currentState = new Xplays(); // Start with X's turn
    }

    public void setState(GameStrategy state) {
        this.currentState = state;
    }

    public void next() {
        currentState.next(this);
    }

    public boolean isGameOver() {
        return currentState.isGameOver();
    }

    public GameStrategy getCurrentState() {
        return currentState;
    }
}
