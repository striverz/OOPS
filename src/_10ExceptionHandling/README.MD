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

- Checked & Unchecked Exceptions
  - These are exceptions that the compiler forces you to handle using try-catch or declare using throws (e.g., IOException, SQLException).
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Main class
class Main {
    public static void main(String[] args) throws FileNotFoundException { 
        File file = new File("test.txt");
        Scanner reader = new Scanner(file); // Must handle or declare exception
    }
}
  ```

  - These occur at runtime and do not require explicit handling. They are usually due to logical errors in the code (e.g., NullPointerException, ArithmeticException).
```java
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int result = 10 / 0; // ArithmeticException (unchecked)
    }
}
  ```