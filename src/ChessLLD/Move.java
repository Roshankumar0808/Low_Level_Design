package ChessLLD;

public class Move {
    private Cell startCell;
    private Cell endCell;

    public Move(Cell startCell, Cell endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }

    public boolean isValid() {
        if (startCell.getPiece() == null) return false;
        return endCell.getPiece() == null || startCell.getPiece().getWhite()!= endCell.getPiece().getWhite();
    }

    public Cell getStartCell() {
        return startCell;
    }

    public Cell getEndCell() {
        return endCell;
    }
}

