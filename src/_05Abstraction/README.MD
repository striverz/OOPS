# Abstraction in Java

## What is `Abstraction`?
Abstraction is the process of hiding the implementation details and showing only the necessary features or interface to the user.

Abstraction is achieved through **abstract classes** and **interfaces** in languages like Java.

---

## Importance of `Abstraction`
- **Hiding Implementation Details**: The goal of abstraction is to hide the complex implementation details of a system and provide a simpler interface for interaction. For example, when you drive a car, you don't need to know how the engine works internally; you just need to know how to start the car, steer, and stop.

---

## How Can We Achieve `Abstraction`?
### `Abstract Classes`
An abstract class is a class that cannot be instantiated on its own and must be inherited by a subclass. It can have both **abstract methods** (without implementation) and **concrete methods** (with implementation).

### `Interfaces`
An interface is similar to an abstract class, but it can only contain abstract methods (until Java 8, after which default methods were introduced). All methods in an interface are implicitly abstract, and it is used to represent a contract that the implementing classes must fulfill.

---

## What is a `static` Method in Java?
`Static` methods belong to the class rather than any instance of the class. This means that they can be called without creating an object of the class. Static methods can only directly access static members of the class, not instance variables or instance methods. They are defined using the `static` keyword.
- [Static Methods](_03StaticMethod.java)
---

## What is a `default` Method in Java?
Default methods were introduced in **Java 8** to allow adding new functionality to interfaces without breaking existing implementations. Prior to Java 8, interfaces could only declare method signatures, leaving the implementation to the classes that implemented the interface. With the introduction of **default methods**, interfaces can now provide default implementations for methods.
- [Default Method](_04DefaultMethod.java)
---

## Can an Abstract Class Extend Another Abstract Class?
Yes, an abstract class can extend another abstract class in Java.When an abstract class extends another abstract class, it inherits its methods (both abstract and concrete). The subclass does not need to implement the abstract methods of the parent class unless it is a concrete (non-abstract) class.
```java
abstract class Animal {
    abstract void makeSound(); // Abstract method
    
    void eat() { // Concrete method
        System.out.println("Eating...");
    }
}

abstract class Dog extends Animal {
    // Dog does not implement makeSound(), so it remains abstract
    abstract void guardHouse();
}

class GermanShepherd extends Dog {
    void makeSound() {
        System.out.println("Barking...");
    }

    void guardHouse() {
        System.out.println("Guarding the house...");
    }
}

class Main {
    public static void main(String args[]) {
        GermanShepherd dog = new GermanShepherd();
        dog.makeSound();  // Output: Barking...
        dog.eat();        // Output: Eating...
        dog.guardHouse(); // Output: Guarding the house...
    }
}


```

---

## Can We Have a Constructor Inside the Abstract Class? 
- an abstract class **can have a constructor**, which can be invoked by a subclass when an instance of the subclass is created. This allows the abstract class to initialize its fields before the subclass adds its own specific behaviors.
```java
abstract class Animal {
    String name;

    // Parent constructor with one parameter
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }
}

class Dog extends Animal {
    String breed;

    // Child constructor with two parameters
    Dog(String name, String breed) {
        super(name); // Calling the parent constructor with 'name'
        this.breed = breed;
        System.out.println("Dog constructor called for: " + name + " of breed: " + breed);
    }

    void display() {
        System.out.println(name + " is a " + breed);
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
    }
}

```

## Can we create an Instace of Abstract Class?
- **No**, you cannot create an instance of an abstract class directly in Java. An abstract class is designed to be inherited by other classes, and it is not meant to be instantiated on its own.
```java
abstract class Animal {
    abstract void makeSound();
}

class Main {
    public static void main(String[] args) {
        Animal a = new Animal(); // ❌ ERROR!
    }
}
```
---

### Can we Override a default Method?
- Yes, we can override default methods in Java.

```java
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
 ```
