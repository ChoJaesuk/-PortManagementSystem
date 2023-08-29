package assignment.truck;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSaver {
    public static void saveData(List<Truck> containers, String filePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(containers);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Truck> trucks = new ArrayList<>();

        Truck truck = new Truck(11.2, "tr-12", "basic");
        Truck truck2 = new Truck(13.2, "tr-25", "reefer");

        trucks.add(truck);
        trucks.add(truck2);

        String filePath = "trucks.txt";
        saveData(trucks, filePath);
    }
}