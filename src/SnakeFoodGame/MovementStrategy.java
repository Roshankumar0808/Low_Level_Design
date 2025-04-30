package SnakeFoodGame;
import java.util.*;
public interface MovementStrategy {
    Pair<Integer,Integer>getNextPosition(Pair<Integer,Integer>curentHead,String direction);
}
