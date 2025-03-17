# 📌 Inner Classes in Java

## 🔹 What are `InnerClasses`?
Inner classes are classes defined **inside another class**. They help to:
- Logically group related classes
- Improve **encapsulation**
- Increase **code readability**

---

## 🔹 Types of `InnerClasses`
✅ **Static Nested Classes**  
✅ **Non-static Inner Classes**  
✅ **Local Inner Classes**  
✅ **Anonymous Inner Classes**

---

## 📌 Static Nested Classes
🔹 A **static nested class** is defined with the `static` modifier. Since it is static, it **does not require** an instance of the outer class to be created.  
🔹 Static nested classes can only access the **static members** of the outer class.

```java
class OuterClass {
    static int staticVar = 100;

    // Static Nested Class
    static class StaticNestedClass {
        void display() {
            System.out.println("Static variable: " + staticVar);
        }
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display(); // Output: Static variable: 100
    }
}
```

---

## 📌 Non-static Inner Classes
🔹 A **non-static inner class** is associated with an instance of the outer class.  
🔹 It has access to **all members** (both static and non-static) of the outer class, including **private members**.

```java
class OuterClass {
    int instanceVar = 42;
    
    // Non-static Nested Inner class
    class InnerClass {
        void display() {
            System.out.println("Instance variable: " + instanceVar);
        }
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display(); // Output: Instance variable: 42
    }
}
```

---

## 📌 Local Inner Classes
🔹 **Local inner classes** are defined **inside a method** or **a block of code**.  
🔹 They are only accessible within the **scope** of that method or block.  
🔹 Local inner classes can access **all members** of the outer class but can only access **effectively final** local variables of the enclosing method.

```java
class OuterClass {
    void outerMethod() {
        int localVar = 10; // Effectively final
        
        // Class defined inside a method
        class LocalInnerClass {
            void display() {
                System.out.println("Local variable: " + localVar);
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display(); // Output: Local variable: 10
    }
}

// Main Class
class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.outerMethod();
    }
}
```

---

## 📌 Anonymous Inner Classes
🔹 **Anonymous inner classes** are a type of **local inner class without a name**.  
🔹 They are often used to **implement interfaces**  for one-time use.

```java
abstract class Greeting {
    abstract void sayHello();
}

class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() { // Anonymous inner class
            void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        greeting.sayHello(); // Output: Hello, World!
    }
}
```

---

🚀 **Inner classes are useful when you need to logically group classes that are only used in one place, improving modularity and encapsulation!**
