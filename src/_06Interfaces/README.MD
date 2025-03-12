- What is an `Interface`?
  - An interface in Java is a blueprint of a class that defines a contract for behavior but does not provide an implementation. It contains a set of abstract methods (methods without a body) that a class must implement if it chooses to "sign the contract" by implementing the interface. 
  
- Can an interface have an `Instance Variables`?
  - No, an interface cannot have instance variables. All fields in an interface are implicitly public, static, and final. This means they act as constants and cannot be changed. Attempting to declare a non-static or non-final field will result in a compilation error.
  
- Can an interface have an `Constructors`?
  - No, interfaces cannot have constructors. This is because constructors are used to initialize the state of an object, and interfaces cannot have state (no instance variables). Since interfaces are not classes and cannot be instantiated directly, they do not need constructors.

- Can a `Class Implement` `Multiple Interfaces`?
  - Yes, a class in Java can implement multiple interfaces. This is one of the key advantages of using interfaces because Java does not support multiple inheritance with classes, but it does with interfaces.

- `Default` and `Static` Methods in Interfaces?
  - Static methods belong to the class rather than any instance of the class. This means that they can be called without creating an object of the class. Static methods can only directly access static members of the class, not instance variables or instance methods. They are defined using the static keyword.
  - Default methods were introduced in Java 8 to allow adding new functionality to interfaces without breaking existing implementations. Prior to Java 8, interfaces could only declare method signatures, leaving the implementation to the classes that implemented the interface. With the introduction of default methods, interfaces can now provide default implementations for methods.

- Why `Default Method were Introduced`?
  - Before Java 8, adding a new method to an interface would break all existing implementations of that interface. This was a limitation when you wanted to evolve libraries and APIs without breaking backward compatibility. To solve this, Java 8 introduced default methods, allowing interfaces to provide method implementations, ensuring existing classes can still work without modification.

- Interface Inheritance?
  - Interfaces in Java can extend other interfaces, allowing for inheritance. When an interface inherits another, it can add new methods to the contract defined by the parent interface.


```java
interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void walk();
}

class Human implements Mammal {
    @Override
    public void eat() {
        System.out.println("Human eats food.");
    }

    @Override
    public void walk() {
        System.out.println("Human walks on two legs.");
    }
}
```