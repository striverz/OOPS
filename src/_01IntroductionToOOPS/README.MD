# Introduction To Object-Oriented Programming

- What is `OOPS`?
  - Object-Oriented Programming is a programming paradigm based on the concepts of objects which contain data and code.The data 
    is represented as fields or attributes and the code is represented as behaviour or methods.Object is an instance of a class,Where class is a blue print for creating the objects
  - [Class And Object](_01ClassAndObject.java)


- What are the `4 Pillars of OOPS`?
  - `Encapsulation` : Encapsulation is the process Where the internal details of an object are kept hidden from the outside of the world. It is the process of bundling objects data and methods together into a single unit or class.
  - `Inheritance` : Inheritance  allows new class to inherit properties and methods of an existing class. The class which inherits is called as subclass and the class from which properties are inherited is called as superClass.
  - `Abstraction` : Abstraction is the process of hiding implementation details and showing only the necessary features or the interface to the user.
  - `Polymorphism` : Polymorphism means the ability of a single entity such as method or object to take multiple forms. The term “polymorphism” is derived from Greek, meaning “many forms.”


- How is `OOP` different from `procedural programming`?
  - Procedural programming follows a step-by-step approach with a sequential flow, where data is globally accessible, making it less secure. OOPS, on the other hand, models real-world entities as objects, encapsulating data within them and, ensuring better security and maintainability.


- What is `Data Hiding`?
  - Data Hiding is the principle where the internal details of the object such as Data fields are kept private and Inaccessible from outside of the object.
    Insted access to these fields are provided by the public methods which are called as `Setters` And `Getters`
  - [Setters And Getters](_02GettersAndSetters.java)


- What are `Constructors`?
  - Constructors are special methods which are used to initialize the objects, Constructors are called when the object of the class is created. Constructors have the same name as class name and it does not have any return type.
  - Types of Constructors
    - Default Constructors
    - Parameterized Constructors
    - Copy Constructor
  - [Constructors in Java](_03Constructors.java)