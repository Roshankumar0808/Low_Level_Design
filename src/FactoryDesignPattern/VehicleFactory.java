package FactoryDesignPattern;

public class VehicleFactory {
    public static Vehicle getvehicle(String vehicleType){
        if(vehicleType.equals("car")){
            return new Car();
        }
        else if(vehicleType.equals("Bike")){
            return new Bike();

        } else if (vehicleType.equals("Bus")) {
            return new Bus();
        }
        else{
            throw  new IllegalArgumentException("This Vehicle is Not Present");
        }
    }
}
