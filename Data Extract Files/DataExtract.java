package dataextract;
import java.io.*;

public class DataExtract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("test.dat"));
        writeFile.writeInt(1);
        writeFile.writeDouble(2.1);
        writeFile.writeUTF(writeFile.getClass().getName());
        writeFile.close();
    }
    
}
