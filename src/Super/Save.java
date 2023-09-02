package Super;

import java.io.FileOutputStream;
import java.io.*;

public interface Save {

    default void save(String PortNum,String ObjectID, Object obj ) {
        try {
            String path = "./src/" +PortNum+"/Data/" + ObjectID+".txt";
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data for %s is saved ", ObjectID);
            System.out.println(" ");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

