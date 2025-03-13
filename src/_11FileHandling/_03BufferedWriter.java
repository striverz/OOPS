package _11FileHandling;
import java.io.*;

public class _03BufferedWriter {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("a.txt", true); // 'true' enables append mode
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Writing in the file
            writer.write("Hello, world!\n");
            writer.write("This is a sample file.");

            // Closing the file after writing
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
