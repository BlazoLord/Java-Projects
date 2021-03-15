package dataextract;
import java.io.*;

public class ReadPairsV2 {
    
    public static void main(String[] args) throws IOException {
        ObjectInputStream readNumbers = new ObjectInputStream(new FileInputStream("numbers2.bin"));
        int numReads[] = new int[3];
        for (int i = 0; i < 3; i++) {
            numReads[i] = readNumbers.readInt();
        }
        
        try {
            ObjectInputStream readRules = new ObjectInputStream(new FileInputStream("rules2.bin"));
            String strReads[] = new String[3];
            for (int i = 0; i < 3; i++) {
                strReads[i] = readRules.readUTF();
            }
            for (int i = 0; i < 3; i++) {
                System.out.printf("%4d : %20s \n", numReads[i], strReads[i]);
            }
            readNumbers.close();
            readRules.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
