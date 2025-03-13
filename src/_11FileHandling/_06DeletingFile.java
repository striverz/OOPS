package _11FileHandling;
import java.io.*;
public class _06DeletingFile {
    public static void main(String[] args) {
        File myFile = new File("a.txt");
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
