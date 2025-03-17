# Java Interfaces

## What is an `Interface`?
An **interface** in Java is a blueprint of a class that defines a contract for what a class can do, without specifying how it does it. It contains:
- **Abstract methods** (methods without a body)
- **Constants** (static final variables)

Any class that implements an interface must provide implementations for all its methods.

---

## Why Use an `Interface`?
- **Multiple Inheritance:** A class can implement multiple interfaces, allowing for functionality from various sources to be combined.

---

## Can an Interface Have `Instance Variables`?
❌ **No!** An interface cannot have instance variables.

✅ All fields in an interface are implicitly **`public static final`**. This means they:
- Act as constants
- Are shared across all implementations
- Cannot be changed

### Example:
```java
interface Constants {
    int VALUE = 100;  // Implicitly public, static, and final
}

// Implementing class
class Demo implements Constants {
    void display() {
        System.out.println("Value: " + VALUE); // Accessing constant
    }
}

public class Main {
    public static void main(String[] args) {
        new Demo().display();  // Output: Value: 100
    }
}
```
---

## Can an Interface Have `Constructors`?
❌ **No!** Interfaces cannot have constructors because:
- Constructors are used to initialize an object's state
- Interfaces cannot have instance variables (state)
- Interfaces are not classes and cannot be instantiated directly

---

## Can a Class Implement Multiple Interfaces?
✅ **Yes!** A class in Java can implement multiple interfaces.

This is one of the key advantages of using interfaces because **Java does not support multiple inheritance with classes, but it does with interfaces**.

➡️ [Multiple Inheritance](_02MultipleInheritance.java)

---

## `Default` and `Static` Methods in Interfaces
- **Static Methods** belong to the interface itself and can be called without creating an object.
- **Default Methods** were introduced in **Java 8** to allow adding new functionality to interfaces **without breaking existing implementations**.

➡️ [Default Method](../_05Abstraction/_04DefaultMethod.java)  
➡️ [Static Method](../_05Abstraction/_03StaticMethod.java)

### Why Were `Default Methods` Introduced?
Before Java 8, adding a new method to an interface **broke all existing implementations** of that interface.

To solve this, **default methods** allow interfaces to provide method implementations, ensuring that existing classes can still work **without modification**.

---

## Interface Inheritance
Interfaces in Java can **extend** other interfaces, allowing for inheritance. When an interface inherits another, it can **add new methods** to the contract defined by the parent interface.

### Example:
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

---

✅ **Interfaces in Java are powerful tools** that enable multiple inheritance, enforce method implementation, and provide flexibility in design.
