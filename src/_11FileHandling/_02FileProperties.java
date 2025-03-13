package _11FileHandling;
import java.io.*;

public class _02FileProperties {
    public static void main(String[] args) {
        File file=new File("a.txt");
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size in bytes: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
