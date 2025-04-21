package TicTacToe;

public class Board {
    private final int row;
    private final int col;
    private Symbol[][] grid;

    public Board(int row,int col){
        this.row=row;
        this.col=col;
        this.grid=new Symbol[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                grid[i][j]=Symbol.EMPTY;
            }
        }
    }

    public boolean isValidMove(Position pos){
        if(pos.row>=0&&pos.row<row&&pos.col>=0&&pos.col<col&&grid[pos.row][pos.col]==Symbol.EMPTY){
              return true;
        }
        return false;
    }

    public void makeMove(Position pos,Symbol symbol){
        grid[pos.row][pos.col]=symbol;
    }
    public void checkGameState(GameContext context) {
        // Check rows
        for (int i = 0; i < row; i++) {
            if (grid[i][0] != Symbol.EMPTY && isWinningLine(grid[i])) {
                if (grid[i][0] == Symbol.X) {
                    context.setState(new Xwon());
                } else {
                    context.setState(new Ywon());
                }
                return;
            }
        }

        // Check columns
        for (int i = 0; i < col; i++) {
            Symbol[] column = new Symbol[row];
            for (int j = 0; j < row; j++) {
                column[j] = grid[j][i];
            }
            if (column[0] != Symbol.EMPTY && isWinningLine(column)) {
                if (column[0] == Symbol.X) {
                    context.setState(new Xwon());
                } else {
                    context.setState(new Ywon());
                }
                return;
            }
        }

        // Check diagonals
        Symbol[] diagonal1 = new Symbol[Math.min(row, col)];
        Symbol[] diagonal2 = new Symbol[Math.min(row, col)];
        for (int i = 0; i < Math.min(row, col); i++) {
            diagonal1[i] = grid[i][i];
            diagonal2[i] = grid[i][col - 1 - i];
        }
        if (diagonal1[0] != Symbol.EMPTY && isWinningLine(diagonal1)) {
            if (diagonal1[0] == Symbol.X) {
                context.setState(new Xwon());
            } else {
                context.setState(new Ywon());
            }
            return;
        }
        if (diagonal2[0] != Symbol.EMPTY && isWinningLine(diagonal2)) {
            if (diagonal2[0] == Symbol.X) {
                context.setState(new Xwon());
            } else {
                context.setState(new Ywon());
            }
            return;
        }

        // Check for draw
        boolean isDraw = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == Symbol.EMPTY) {
                    isDraw = false;
                    break;
                }
            }
            if (!isDraw) break;
        }

//        if (isDraw) {
//            context.setState(new DrawState());
//        }

            context.next();

    }

    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        for (Symbol s : line) {
            if (s != first) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
