package ChessLLD;

import java.util.ArrayList;

public class Game {
    private Board board;
    private Player player1, player2;
    private boolean isWhiteTurn;
    private ArrayList<Move> gameLog;
    private Status status;
    private GameEventListener listener;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = Board.getInstance(8);
        this.isWhiteTurn = true;
        this.status = Status.ACTIVE;
        this.gameLog = new ArrayList<>();
    }

    public void setObserver(GameEventListener listener) {
        this.listener = listener;
    }

    private void notifyMoveMade(Move move) {
        if (listener != null) {
            listener.onMoveMade(move);
        }
    }

    private void notifyGameStateChanged(Status state) {
        if (listener != null) {
            listener.onGameStateChanged(state);
        }
    }

    public void makeMove(Move move, Player player) {
        if(!move.isValid()) {
            return;
        }
        piece sourcePiece = move.getStartCell().getPiece();
        if (sourcePiece.canMove(this.board, move.getStartCell(), move.getEndCell())) {
            piece destinationPiece = move.getEndCell().getPiece();
            if (destinationPiece instanceof King) {
                this.status = sourcePiece.getWhite() ? Status.WHITE_WIN : Status.BLACK_WIN;
                notifyGameStateChanged(this.status);
                return;
            }
            if (destinationPiece != null) destinationPiece.setKilled(true);
            move.getEndCell().setPiece(sourcePiece);
            move.getStartCell().setPiece(null);
            gameLog.add(move);
            notifyMoveMade(move);
            isWhiteTurn = !isWhiteTurn;
        }
    }

    public void start() {
        makeMove(new Move(board.getCell(1, 0), board.getCell(2, 0)), player1);
        makeMove(new Move(board.getCell(6, 0), board.getCell(5, 0)), player2);
    }
}

