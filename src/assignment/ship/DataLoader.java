package assignment.ship;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DataLoader {
    public static List<Ship> loadData(String filePath) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Ship>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String filePath = "ships.txt";
        List<Ship> loadedContainers = loadData(filePath);

        if (loadedContainers != null) {
            for (Ship container : loadedContainers) {
                System.out.println(container.toString());
            }
        } else {
            System.out.println("Failed to load data.");
        }
    }
}