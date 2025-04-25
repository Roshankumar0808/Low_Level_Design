package ChessLLD;



public class piece {
    private Boolean isWhite;
    private Boolean isKilled=false;
    private pieceMovementStrategy pieceMovementStrategy;

    public piece(Boolean isWhite, pieceMovementStrategy pieceMovementStrategy) {
        this.isWhite = isWhite;
        this.pieceMovementStrategy = pieceMovementStrategy;
    }

    public Boolean getWhite() {
        return isWhite;
    }

    public void setWhite(Boolean white) {
        isWhite = white;
    }

    public Boolean getKilled() {
        return isKilled;
    }

    public void setKilled(Boolean killed) {
        isKilled = killed;
    }

    public pieceMovementStrategy getPieceMovementStrategy() {
        return pieceMovementStrategy;
    }

    public void setPieceMovementStrategy(pieceMovementStrategy pieceMovementStrategy) {
        this.pieceMovementStrategy = pieceMovementStrategy;
    }
    public boolean canMove(Board board,Cell StartCell,Cell Endcell) {
       return pieceMovementStrategy.canMove(board,StartCell,Endcell);
    }
}
