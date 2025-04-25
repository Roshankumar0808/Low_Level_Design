package ChessLLD;



public class ChessMain {
    public static void run(){
        Player player1=new Player("roshan",false);
        Player player2=new Player("Aman",true);
        Game Game=new Game(player1,player2);
        Game.start();
    }

}
