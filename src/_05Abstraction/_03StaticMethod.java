package _05Abstraction;

interface Vehicle {
    static void service() {
        System.out.println("Vehicle service in progress...");
    }
}

class Car implements Vehicle {
    // No need to implement static methods from the interface
}

class _03StaticMethod {
    public static void main(String[] args) {
        Vehicle.service(); // Output: Vehicle service in progress...
    }
}
