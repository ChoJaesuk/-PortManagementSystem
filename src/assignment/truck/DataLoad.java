package assignment.truck;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DataLoad {
    public static List<Truck> loadData(String filePath) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Truck>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String filePath = "trucks.txt";
        List<Truck> loadedContainers = loadData(filePath);

        if (loadedContainers != null) {
            for (Truck container : loadedContainers) {
                System.out.println(container.toString());
            }
        } else {
            System.out.println("Failed to load data.");
        }
    }
}