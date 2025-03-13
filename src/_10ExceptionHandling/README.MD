- What is `Exception Handling`?
  - Exception handling is a mechanism  that helps manage runtime errors and maintain the normal flow of a program.
  - An exception is an unwanted or unexpected event that occurs during program execution.
  
- Importance of Exception Handling
  - Prevents crashes: Ensures that a single error doesn't stop the entire program.
  - Encapsulates error handling: Separates normal code from error-handling code.
  - Improves debugging: Helps in identifying and resolving errors quickly.

- Mechanism to handle Exception (Try-Catch Block)

```java 
try {
    // Code that might cause an exception
} 
catch (ExceptionType e) {
    // Code to handle the exception
}
```

- What is `finally` block in `Exception Handling`?
  - The finally block is always executed, whether an exception occurs or not. It is used to close resources such as files, database connections, or network sockets.

- `throw and throws` keywords In `Exception Handling`?
  - The throw keyword is used inside a method or block to explicitly throw an exception.
  - The throws keyword is used in a method signature to indicate that the method might throw an exception.