### **Inheritance**

#### **What is `Inheritance`?**
- Inheritance allows a new class to inherit properties and methods from an existing class.The class that inherits is called a **Subclass**, and the class from which it inherits is called a **SuperClass**.
- It is a mechanism that promotes **code reusability** and establishes a **hierarchical relationship** between classes.

---

#### **Importance of `Inheritance`?**
- **Reusability**: It allows you to reuse the code of an existing class in a new class. Instead of rewriting code, the subclass (child class) can inherit the methods and attributes of the parent class. This reduces redundancy and promotes efficient coding.

---

#### **Types of `Inheritance`?**
- **Single Inheritance**: A one-to-one relationship is established.
- **Multilevel Inheritance**: A one-to-one-to-one relationship across multiple levels is established.
- **Hierarchical Inheritance**: A one-to-many relationship is established between classes.

---

#### **Important Concepts in `Inheritance`?**
- **Access Modifiers**
- **Method Overriding (`@Override`)**
- **`super` Keyword**

---

#### **Difference between `Method Overloading` and `Method Overriding`?**
- **Method Overloading**: Occurs when two or more methods in the same class have the same name but different parameter lists (number, type, or order of parameters).
- **Method Overriding**: Redefining the method of a `SuperClass` in the `SubClass` is called **Method Overriding**.

---

#### **`Multiple Inheritance` in Java?**
- **Multiple inheritance** refers to a feature in object-oriented programming where a class can inherit properties and methods from more than one parent class. This allows the child class to combine the functionality of multiple parent classes.
- **Diamond Problem** occurs when a class inherits from two classes that have methods with the same name. The compiler cannot determine which method to execute.
- If both `B` and `C` inherit from `A` and override a method, and `D` inherits from both `B` and `C`, which version of the method should `D` inherit? This ambiguity is why Java restricts multiple inheritance for classes.
- **Java does not allow multiple inheritance using classes** to avoid the diamond problem, but it allows multiple inheritance through **interfaces**, as interfaces only declare method signatures (without method bodies initially), thus preventing conflicts.
