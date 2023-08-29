package assignment.ship;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSave {
    public static void saveData(List<Ship> containers, String filePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(containers);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Ship> ships = new ArrayList<>();

        Ship ship = new Ship(11.2, "sh-12");
        Ship ship2 = new Ship(13.2, "sh-25");

        ships.add(ship);
        ships.add(ship2);

        String filePath = "ships.txt";
        saveData(ships, filePath);
    }
}
