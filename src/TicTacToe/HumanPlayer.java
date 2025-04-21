package TicTacToe;

import java.util.Scanner;

public class HumanPlayer implements PlayerStrategy{
   public String name;
   public Scanner scanner;

    public HumanPlayer(Scanner scanner, String name) {
        this.scanner = new Scanner(System.in);
        this.name = name;
    }

    @Override
    public Position move(Board board) {
        while(true){
            try{
                int row=scanner.nextInt();
                int col=scanner.nextInt();
                Position move=new Position(row,col);
                if(board.isValidMove(move)){
                    return move;
                }
                System.out.println("Given row and col is already filled");
            }catch (Exception e){
                System.out.println("Given row and col only take integer");
                scanner.nextLine();
            }
        }

    }
}
