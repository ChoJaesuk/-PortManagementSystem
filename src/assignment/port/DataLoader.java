package assignment.port;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DataLoader {
    public static List<Port> loadData(String filePath) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Port>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String filePath = "ports.txt";
        List<Port> loadedContainers = loadData(filePath);

        if (loadedContainers != null) {
            for (Port container : loadedContainers) {
                System.out.println(container.toString());
            }
        } else {
            System.out.println("Failed to load data.");
        }
    }
}