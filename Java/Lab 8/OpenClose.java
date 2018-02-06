import java.lang.*;

class Vehicle {
    public void startCar(Car c) {
        c.startEngine();
    }
}

abstract class Car {
    abstract void startEngine();
}

class SportsCar extends Car {
    public void startEngine() {
        System.out.println("Starting engine: VROOM VROOM!!!");
    }
}

class OpenClose {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        SportsCar sc = new SportsCar();

        v.startCar(sc);
    }
}