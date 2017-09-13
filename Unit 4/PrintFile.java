import java.util.Scanner;
import java.io.*;
public class PrintFile{
    public static void main( String[] args ) throws IOException {
        Scanner inFile = new Scanner( new File("Hello.txt"));
        java.io.File file = new java.io.File("Hello.txt");
        if (file.exists()){
            System.out.println("File already exists.");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("Hello World!");
        output.close();
        System.out.println();
    }
}
