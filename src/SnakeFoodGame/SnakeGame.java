package SnakeFoodGame;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SnakeGame {
    private GameBoard board;
    private Deque<Pair<Integer,Integer>>snake;
    private Map<Pair<Integer,Integer>,Boolean>mp;
    int[][] food;
    private MovementStrategy movementStrategy;
    private int foodIndex;

    public SnakeGame(GameBoard board, int[][] food) {
        this.board = GameBoard.getInstance(board.getWidth(), board.getHeight());
        this.foodIndex = 0;
        this.movementStrategy = new HumanPlayerMovement();
        this.food = food;
        this.mp = new HashMap<>();
        this.snake = new LinkedList<>();
    }
    public void setMovementStrategy(MovementStrategy movementStrategy){
        this.movementStrategy=movementStrategy;
    }

    public GameBoard getBoard() {
        return board;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }

    public Deque<Pair<Integer, Integer>> getSnake() {
        return snake;
    }

    public void setSnake(Deque<Pair<Integer, Integer>> snake) {
        this.snake = snake;
    }

    public Map<Pair<Integer, Integer>, Boolean> getMp() {
        return mp;
    }

    public void setMp(Map<Pair<Integer, Integer>, Boolean> mp) {
        this.mp = mp;
    }

    public int[][] getFood() {
        return food;
    }

    public void setFood(int[][] food) {
        this.food = food;
    }

    public MovementStrategy getMovementStrategy() {
        return movementStrategy;
    }

    public int getFoodIndex() {
        return foodIndex;
    }

    public void setFoodIndex(int foodIndex) {
        this.foodIndex = foodIndex;
    }

    public int move(String direction){
        Pair<Integer,Integer>currentHead=this.snake.peekFirst();
        Pair<Integer,Integer>newHead=this.movementStrategy.getNextPosition(currentHead,direction);
        int newRow=newHead.getKey();
        int newCol=newHead.getValue();

        boolean crossBoundary=newRow<0||newRow>= board.getHeight()||newCol<0||newCol>= board.getWidth();

        Pair<Integer,Integer>currentTail=this.snake.peekLast();

        boolean bitItself=this.mp.containsKey(newHead)&&!(newHead.equals(currentTail));

        if(crossBoundary||bitItself){
            return -1;
        }

        boolean atefood=foodIndex<food.length&&food[foodIndex][0]==newRow&&food[foodIndex][0]==newCol;

        if(atefood){
            foodIndex++;
        }
        else{
            this.snake.pollLast();
            this.mp.remove(currentTail);
        }
         this.snake.offerFirst(newHead);
        this.mp.put(newHead,true);
        return snake.size()-1;
    }
}
