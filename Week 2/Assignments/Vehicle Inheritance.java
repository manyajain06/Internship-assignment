class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key turn.");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a self button.");
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myCar.start();
        myBike.start();
    }
}
