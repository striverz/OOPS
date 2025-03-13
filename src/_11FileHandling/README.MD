- What is `FileHandling`?
  - File handling refers to the process of reading from and writing to files to store and retrieve data in a persistent manner. It allows programs to interact with files stored on disk, enabling long-term data storage and retrieval.
  - There are various operations involved in File Handling, some of which are
    - Creating a file
    - Reading from a file
    - Writing a file
    - Appending data to a file
    - Delecting a file
    

- File Class in `Java`?
  - The File class in Java provides various methods to manipulate files and directories. Some of the commonly used methods are:
    - createNewFile(): Creates a new empty file.
    - exists(): Checks if a file exists.
    - delete(): Deletes a file.
    - getAbsolutePath(): Returns the file's absolute path.
    - length(): Returns the size of the file in bytes.
    - canRead(), canWrite(): Checks file permissions.

- FileWriter and BufferedWriter
  - The FileWriter class is used to write character-based data to a file, and BufferedWriter improves efficiency by buffering large amounts of data before writing.

- FileReader and BufferedReader
  - The FileReader class is used to read data from a file as a stream of characters, while BufferedReader improves efficiency by reading large chunks of data at once.

- Try-with-Resources
  - The try-with-resources statement automatically closes the file resource after execution, ensuring proper resource management. This eliminates the chances of missing closing any file used in the codebase preventing resource leakage.
  - The try-with-resource is nothing but a try block with the resources declared in its arguments.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Main class
class Main {
    public static void main(String[] args) {
        
        // Try with Resources (removes the need to close the file explicitly)
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

- Common File Handling Issues
  - FileNotFoundException: Occurs when the specified file does not exist. It can be avoided by checking if the file exists before attempting to read it.
  - IOException: Occurs due to issues like permission restrictions, insufficient disk space, or network failure. It can be handled using try-catch blocks.
  - Resource Leaks: Forgetting to close file streams can lead to memory leaks. To avoid this, the best practice is to use try-with-resources to automatically close resources.