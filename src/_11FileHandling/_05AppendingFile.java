package _11FileHandling;
import java.io.*;
public class _05AppendingFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("a.txt", true); // 'true' enables append mode
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Appending new data using BufferedWriter.");
            bufferedWriter.newLine(); // Moves to a new line
            bufferedWriter.write("This is another appended line.");

            bufferedWriter.close(); // Always close the writer
            System.out.println("Successfully appended to the file using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
