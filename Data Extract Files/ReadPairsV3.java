package dataextract;
import java.io.*;

public class ReadPairsV3 {
    
    public static void main(String[] args) throws IOException {
        ObjectInputStream readNumbers = new ObjectInputStream(new FileInputStream("numbers3.bin"));
        int numReads[] = new int[2];
        for (int i = 0; i < 2; i++) {
            numReads[i] = readNumbers.readInt();
        }
        
        ObjectInputStream readRules = new ObjectInputStream(new FileInputStream("rules3.bin"));
        String strReads[] = new String[2];
        for (int i = 0; i < 2; i++) {
            strReads[i] = readRules.readUTF();
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.printf("%4d : %20s \n", numReads[i], strReads[i]);
        }
        readNumbers.close();
        readRules.close();
    }
    
}
