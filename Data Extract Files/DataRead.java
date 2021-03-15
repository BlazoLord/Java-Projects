package dataextract;
import java.io.*;

public class DataRead {
    
    public static void main(String[] args) throws IOException {      
        ObjectInputStream readFile = new ObjectInputStream(new FileInputStream("test.dat"));
        int num1 = readFile.readInt();
        double num2 = readFile.readDouble();
        String str = readFile.readUTF();
        
        System.out.println("File number 1: " + num1 + "\nFile number 2: " 
                + num2 + "\nFile String: " + str);
    }
    
}
