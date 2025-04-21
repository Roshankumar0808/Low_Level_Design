package TicTacToe;

public class Player {
    public Symbol symbol;
    public PlayerStrategy playerStrategy;

    public Player(Symbol symbol, PlayerStrategy playerStrategy) {
        this.symbol = symbol;
        this.playerStrategy = playerStrategy;
    }
    public Position move(Board board){
      return   playerStrategy.move(board);
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerStrategy getPlayerStrategy() {
        return playerStrategy;
    }

    public void setPlayerStrategy(PlayerStrategy playerStrategy) {
        this.playerStrategy = playerStrategy;
    }
}
