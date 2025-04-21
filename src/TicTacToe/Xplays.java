package TicTacToe;

public class Xplays implements GameStrategy{

    @Override
    public void next(GameContext context) {
        context.setState(new Oplays());
    }

    @Override
    public boolean isGameOver() {
        return false;
    }


}
