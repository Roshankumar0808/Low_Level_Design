package FactoryDesignPattern;

public class FactoryDesignMain {
    public static void run(){
        Vehicle vehicle1=VehicleFactory.getvehicle("car");
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle2=VehicleFactory.getvehicle("Bike");
        vehicle2.start();
        vehicle2.stop();
        Vehicle vehicle3=VehicleFactory.getvehicle("Bus");
        vehicle3.start();
        vehicle3.stop();


        //One doubt that can arise is my why my vehicle factory return type is Vehicle when i am return new Car(),new Bus(),as these methods jsut implements Vehicle Interface

//        Ans:
//        Interface Implementation:
//
//        Car, Bike, and Bus all implement the Vehicle interface
//
//        This means each of these classes is a type of Vehicle (an "is-a" relationship)
//
//        Polymorphism:
//
//        In Java (and OOP in general), a subclass object can be treated as an instance of its superclass or interface
//
//        When you return new Car(), it's both a Car and a Vehicle
//
//        Factory Pattern Purpose:
//
//        The factory hides the concrete implementations from the caller
//
//        The caller only needs to know about the Vehicle interface
//
//        This allows you to change implementations without affecting client code
    }
}
