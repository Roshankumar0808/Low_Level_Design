package SnakeFoodGame;

public class AIPlayerMovement implements MovementStrategy{
    @Override
    public Pair<Integer, Integer> getNextPosition(Pair<Integer, Integer> curentHead, String direction) {
        return curentHead;
    }
}
