# 📌 Understanding the `static` Keyword in Java

## 🔹 What is `static` in Java?
In Java, the `static` keyword is used to indicate that a member belongs to the **class** rather than to any specific instance of the class. It can be applied to **variables, methods, blocks,** and **nested classes**. Members marked as `static` are **shared across all instances** of the class, meaning they are loaded only **once** in memory during the class's lifecycle.

---

## ✅ Advantages of Static Members in Java
- 🚀 **Memory Efficiency**: Static variables are loaded into memory only once, reducing memory usage.
- 🔧 **Utility Functions**: Static methods are ideal for utility or helper methods that do not require object-specific data (e.g., `Math.sqrt()`).

---

## 🔹 What is a Static Variable?
A **static variable** (also called a **class variable**) is a variable that is **shared** among all instances of a class. It is declared using the `static` keyword and belongs to the **class** rather than any specific instance.  
📌 **Reference**: [Static Variable](_01StaticVariable.java)

---

## 🔹 What is a Static Method?
A **static method** is a method that that is **shared** among all instances of a class. It is declared using the `static` keyword and can be called **without creating an object** of the class. Static methods can **only access static variables** and **other static methods**.  
📌 **Reference**: [Static Methods](_02StaticMethod.java)

---

## 🔹 What is a Static Block?
A **static block** is a block of code inside a class that is **executed only once** when the class is **loaded into memory**. It is used to initialize **static variables**.  
📌 **Reference**: [Static Blocks](_03StaticBlocks.java)

---

## ❓ Can a Static Method Access a Non-Static Method?
❌ **No**, a `static` method **cannot directly access** a non-static method or a non-static variable in Java. This is because **static methods belong to the class**, while **non-static methods belong to instances of the class**.

---

## ⚠️ Example - Invalid Access (Compilation Error)
```java
class Example {
    int num = 10;  // Non-static variable

    void nonStaticMethod() {  // Non-static method
        System.out.println("This is a non-static method.");
    }

    static void staticMethod() {  // Static method
        System.out.println(num);  // ❌ ERROR: Cannot access non-static variable
        nonStaticMethod();        // ❌ ERROR: Cannot call non-static method
    }
}
```

---

## ✅ How to Access Non-Static Members in a Static Method?
```java
class Example {
    int num = 10;

    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    static void staticMethod() {
        Example obj = new Example(); // Create an instance
        System.out.println(obj.num); // ✅ Access non-static variable
        obj.nonStaticMethod();       // ✅ Call non-static method
    }

    public static void main(String[] args) {
        staticMethod(); // Calling the static method
    }
}
```

---

🎯 **Happy Coding! 🚀**
