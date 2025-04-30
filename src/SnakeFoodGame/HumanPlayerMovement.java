package SnakeFoodGame;

public class HumanPlayerMovement implements MovementStrategy{
    @Override
    public Pair<Integer, Integer> getNextPosition(Pair<Integer, Integer> curentHead, String direction) {
        int row=curentHead.getKey();
        int col=curentHead.getValue();
        switch (direction){
            case "U":return new Pair<>(row-1,col);
            case "D":return new Pair<>(row+1,col);
            case "L":return new Pair<>(row,col-1);
            case "R":return new Pair<>(row,col+1);
            default: return curentHead;
        }
    }
}
