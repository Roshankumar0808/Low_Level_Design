package TicTacToe;

public class Oplays implements GameStrategy{

    @Override
    public void next(GameContext gameContext) {
        gameContext.setState(new Xplays());

    }

    @Override
    public boolean isGameOver() {
        return false;
    }


}
