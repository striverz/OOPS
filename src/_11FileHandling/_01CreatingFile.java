package _11FileHandling;

import java.io.*;

public class _01CreatingFile {
    public static void main(String[] args) {
        try{
            File file=new File("a.txt");
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }
            else{
                System.out.println("File is already exists");            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
