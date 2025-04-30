package SnakeFoodGame;

import java.util.Scanner;



public class SnakeGameEngine {
    public static void run(){
        int width=20;
        int height=15;
        int[][] foodPoision={
                {5,5},
                {10,8},
                {3,12},
                {5,7},
                {12,11}
        };
        GameBoard board=GameBoard.getInstance(width,height);
        SnakeGame snakeGame=new SnakeGame(board,foodPoision);

        Scanner scanner=new Scanner(System.in);
        boolean gamestart=true;
        int score=0;
        while(gamestart){
            displayok(snakeGame);
            String Input=scanner.nextLine().toUpperCase();
            if(Input.equals("Q")){
                System.out.println(score);
                gamestart=false;
            }
            if(Input.isEmpty()){
                System.out.println("Invalid Input");
                continue;
            }
            score= snakeGame.move(Input);
            if(score==-1){
                System.out.println(snakeGame.getSnake().size());
            }
            else{
                System.out.println(score);
            }

        }
      scanner.close();

    }

    private static void displayok(SnakeGame snakeGame) {
        System.out.println(snakeGame.getSnake().size());
    }

}
