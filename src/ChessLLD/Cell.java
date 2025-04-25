package ChessLLD;

public class Cell {
    private int row;
    private int col;
    private piece piece;

    public Cell(int row, int col, piece piece) {
        this.row = row;
        this.col = col;
        this.piece = piece;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public piece getPiece() {
        return piece;
    }

    public void setPiece(piece piece) {
        this.piece = piece;
    }
    public String getlable(){
         String location=this.row+","+this.col;
         return location;
    }

}
