- What is `Polymorphism`?
  - Polymophism refers to the ability of a single entity such as method or object to take multiple forms.
  - The term “polymorphism” is derived from Greek, meaning “many forms.” In programming, it allows the same method or object to perform different tasks depending on the context.
  - [Polymorphism](_01Polymorphism.java)


- What are the types of `Polymorphism`?
  - `Compile time Polymorphism (Static Polymorphism)` : In compile-time polymorphism, the method to be called is resolved at compile time.It is achieved through method overloading or operator overloading (not supported in Java).
  - `Run time Polymorphism (Dynamic Polymorphism)` : In run-time polymorphism, the method to be called is resolved during the runtime. It is achieved through method overriding.
 

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

- Can a return type differentiate the method overloading?
- whether two methods in the same class can be considered overloaded if they have the same method name and the same parameter list, but different return types.?
  - No, return type alone cannot differentiate method overloading
  
```java
class Example {
    int show() {  // Method 1
        return 10;
    }

    // ❌ Compilation Error: Duplicate method 'show()' in type 'Example'
    double show() {  // Method 2 (Only return type differs)
        return 10.5;
    }
}

```

- Can we Override a static method?
  - No, we cannot override a static method in Java. However, we can redefine it in a child class. This concept is known as method hiding, not overriding.

```java
class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void display() {  // This is method hiding, not overriding( if we use @Override in the method signature we get the error)
        System.out.println("Static method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display();  // Calls Parent's static method

        Child obj2 = new Child();
        obj2.display();  // Calls Child's static method

        Parent obj3 = new Child();
        obj3.display();  // Calls Parent's static method (method hiding, no runtime polymorphism)
    }
}

```

- How to trigger a static method from child class?
  - Since static methods belong to the class and not instances, they should be called using the class name, not an object.
```java
class Child extends Parent {
    static void show() {
        Parent.display(); // ✅ Correct way to call Parent's static method
    }
}

  ```