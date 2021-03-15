package dataextract;
import java.io.*;

public class ReadPairsV1 {
    
    public static void main(String[] args) throws IOException {
        ObjectInputStream readNumbers = new ObjectInputStream(new FileInputStream("numbers1.bin"));
        int numReads[] = new int[5];
        for (int i = 0; i < 5; i++) {
            numReads[i] = readNumbers.readInt();
        }
        
        ObjectInputStream readRules = new ObjectInputStream(new FileInputStream("rules1.bin"));
        String strReads[] = new String[5];
        for (int i = 0; i < 5; i++) {
            strReads[i] = readRules.readUTF();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%4d : %20s \n", numReads[i], strReads[i]);
        }
        readNumbers.close();
        readRules.close();
    }
    
}
