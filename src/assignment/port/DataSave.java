package assignment.port;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSave {
    public static void saveData(List<Port> containers, String filePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(containers);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Port> ports = new ArrayList<>();

        Port port1 = new Port("con1", "con-1", 15.2, 25.2, 13.2, true);
        Port port2 = new Port("con2", "con-2", 12.4, 22.5, 14.0, true);

        ports.add(port1);
        ports.add(port2);

        String filePath = "ports.txt";
        saveData(ports, filePath);
    }
}
