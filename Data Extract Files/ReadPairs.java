package dataextract;
import java.io.*;

public class ReadPairs {
    
    public static void main(String[] args) throws IOException {
        ObjectInputStream readNumbers = new ObjectInputStream(new FileInputStream("numbers3.bin"));      
        ObjectInputStream readRules = new ObjectInputStream(new FileInputStream("rules3.bin"));
        
        boolean check = true;
        int numReads[] = new int[5];
        String strReads[] = new String[5];
        int count = 0;
        try {
            while(check) {
                numReads[count] = readRules.readInt();
                count++;
            }
        }
        catch(Exception e) {
            throw e;
        }
        
        count = 0;
        try {
            while(check) {
                strReads[count] = readRules.readUTF();
                count++;
            }
        }
        catch(Exception e) {
            throw e;
        }
        
        for (int i = 0; i < numReads.length; i++) {
            System.out.printf("%4d : %20s \n", numReads[i], strReads[i]);
        }
        
        readNumbers.close();
        readRules.close();
    }
    
}
