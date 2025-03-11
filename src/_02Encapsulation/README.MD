# Access Modifiers in Java

## What is Encapsulation?
Encapsulation is the process where the internal details of an object are kept hidden from the outside world. It involves bundling an object's data and methods together into a single unit or class.

In simple terms, encapsulation ensures that the object's internal workings remain hidden, allowing external entities to interact with the object only through well-defined interfaces (methods).

### Importance of Encapsulation
- **Data Security**: The most significant benefit is data protection. Sensitive data can be hidden from external manipulation and can only be accessed or modified in a controlled manner.
- **Modular Code**: Encapsulation promotes cleaner, modular code by bundling related data and behaviors together. It helps in organizing the code, making it more readable and maintainable.

## Access Modifiers in OOP
Access modifiers in Object-Oriented Programming (OOP) are keywords that define the visibility and accessibility of classes, methods, and other members of a program.

### Types of Access Modifiers
- **`Public`**: Accessible everywhere (within the same class, same package, and outside the package).
- **`Private`**: Accessible only within the class where it is declared.
- **`Protected`**: Accessible within the same package and by subclasses in other packages.
- **`Default`** (No Modifier): Accessible within the same package (package-private).

## Summary of Access Modifiers

| Modifier   | Within Class | Within Package | Subclass (Different Package) | Outside Package |
|------------|-------------|----------------|------------------------------|----------------|
| `private`  | ✅ Yes      | ❌ No          | ❌ No                        | ❌ No          |
| `default`  | ✅ Yes      | ✅ Yes         | ❌ No                        | ❌ No          |
| `protected`| ✅ Yes      | ✅ Yes         | ✅ Yes (via inheritance)     | ❌ No          |
| `public`   | ✅ Yes      | ✅ Yes         | ✅ Yes                       | ✅ Yes         |
