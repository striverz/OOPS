- What is `Polymorphism`?
  - Polymophism refers to the ability of a single entity such as method or object to take multiple forms.
  - he term “polymorphism” is derived from Greek, meaning “many forms.” In programming, it allows the same method or object to perform different tasks depending on the context.

- What are the types of `Polymorphism`?
  - `Compile time Polymorphism (Static Polymorphism)` : In compile-time polymorphism, the method to be called is resolved at compile time.It is achieved through method overloading or operator overloading (not supported in Java).
  - `Run time Polymorphism (Dynamic Polymorphism)` : In run-time polymorphism, the method is resolved during the runtime. It is achieved through method overriding.
 

- What is Dynamic Method `Dispatch`? 
  - Dynamic Method Dispatch (also known as Runtime Polymorphism) is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
  - `How It Works`
    - A superclass reference is used to refer to a subclass object.
    - The method that gets executed is determined at runtime, based on the actual subclass object, not the reference type.
    
```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Parent obj;  // Parent class reference

        obj = new Parent();
        obj.show();  // Output: Parent class method

        obj = new Child();  // Upcasting: Parent reference, but Child object
        obj.show();  // Output: Child class method (Resolved at runtime)
    }
}

```
  