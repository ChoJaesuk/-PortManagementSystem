package assignment.container;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSave {
    public static void saveData(List<Container> containers, String filePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(containers);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Container> containers = new ArrayList<>();

        Container container1 = new Container("con1", "con-1", "dryStorage", 25.2, 13.2);
        Container container2 = new Container("con2", "con-2", "coolStorage", 22.5, 14.0);

        containers.add(container1);
        containers.add(container2);

        String filePath = "containers.txt";
        saveData(containers, filePath);
    }
}


