package _11FileHandling;
import java.io.*;
public class _04BufferReader {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("a.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            int i = 1;

            // Read each line until nothing is left
            while((line = reader.readLine()) != null) {
                System.out.println("Line " + i + ": " + line);
                i++;
            }

            reader.close(); //Close the file after reading
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
