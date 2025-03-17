package _05Abstraction;
interface Vehicle1 {
    // Default method with implementation
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car1 implements Vehicle1 {
    // Inheriting the default method
}

class Bike implements Vehicle1 {
    // Overriding the default method
    public void start() {
        System.out.println("Bike is starting...");
    }
}

class _04DefaultMethod {
    public static void main(String[] args) {
        Vehicle1 car = new Car1();
        car.start(); // Output: Vehicle is starting...

        Vehicle1 bike = new Bike();
        bike.start(); // Output: Bike is starting...
    }
}
