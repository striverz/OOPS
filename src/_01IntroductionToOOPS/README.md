# Introduction To Object-Oriented Programming

## What is `OOPS`?
Object-Oriented Programming is a programming paradigm based on the concepts of objects, which contain data and code. The data is represented as fields or attributes, and the code is represented as behavior or methods. An object is an instance of a class, where a class is a blueprint for creating objects.

📌 [Class And Object](_01ClassAndObject.java)

---

## What are the `4 Pillars of OOPS`?
- **`Encapsulation`**: Encapsulation is the process where the internal details of an object are kept hidden from the outside world. It is the process of bundling an object's data and methods together into a single unit or class.
- **`Inheritance`**: Inheritance allows a new class to inherit properties and methods of an existing class. The class which inherits is called a subclass, and the class from which properties are inherited is called a superclass.
- **`Abstraction`**: Abstraction is the process of hiding implementation details and showing only the necessary features or interface to the user.
- **`Polymorphism`**: Polymorphism means the ability of a single entity, such as a method or object, to take multiple forms. The term “polymorphism” is derived from Greek, meaning “many forms.”

---

## How is `OOP` different from `Procedural Programming`?
Procedural programming follows a step-by-step approach with a sequential flow, where data is globally accessible, making it less secure. OOPS, on the other hand, models real-world entities as objects, encapsulating data within them and ensuring better security and maintainability.

---

## What is `Data Hiding`?
Data Hiding is the principle where the internal details of the object, such as data fields, are kept private and inaccessible from outside of the object. Instead, access to these fields is provided by public methods called `Setters` and `Getters`.

📌 [Setters And Getters](_02GettersAndSetters.java)

---

## What are `Constructors`?
Constructors are special methods used to initialize objects. They are called when an object of the class is created. Constructors have the same name as the class name and do not have any return type.

### Types of Constructors:
- **Default Constructors**
- **Parameterized Constructors**
- **Copy Constructor**

📌 [Constructors in Java](_03Constructors.java)
