package SnakeFoodGame;

public class FoodFactory
{
    public static FoodItem createFoodFactory(int[] points,String type){
        if("bonus".equalsIgnoreCase(type)){
            return new BonusFood(points[0],points[1]);
        }
        return new NormalFood(points[0],points[1]);
    }

}
