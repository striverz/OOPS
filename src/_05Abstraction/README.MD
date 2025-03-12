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

---

## What is a `default` Method in Java?
Default methods were introduced in **Java 8** to allow adding new functionality to interfaces without breaking existing implementations. Prior to Java 8, interfaces could only declare method signatures, leaving the implementation to the classes that implemented the interface. With the introduction of **default methods**, interfaces can now provide default implementations for methods.

---

## Can an Abstract Class Extend Another Abstract Class?
Yes, an abstract class can extend another abstract class in Java.

---

## Can We Have a Constructor and Create an Instance of an Abstract Class?
- **No**, you cannot create an instance of an abstract class directly in Java. An abstract class is designed to be inherited by other classes, and it is not meant to be instantiated on its own.
- However, an abstract class **can have a constructor**, which can be invoked by a subclass when an instance of the subclass is created. This allows the abstract class to initialize its fields before the subclass adds its own specific behaviors.

---
