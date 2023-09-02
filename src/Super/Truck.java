package Super;

import java.util.ArrayList;

public class Truck extends Vehicle{
    private String Type;
    private String ID;
    private Double fuel;
    private Double capacity;
    private ArrayList<Container> containers;
    public Truck(){
        fuel = 100.0;
    }

    public String getID() {
        return ID;
    }

    private Truck(String ID, String Type, Double Capacity){
        this.ID = ID;
        this.Type = Type;
        this.capacity = Capacity;
    }

    @Override
    public void loadContainer(Container container) {
        containers.add(container);
    }

    @Override
    public void unloadContainer(Container container) {
        containers.remove(container);
    }

    @Override
    public Double getFuel() {
        return fuel;
    }

    @Override
    public Double FuelConsumption(Double consumption) {
        this.fuel -= consumption;
        return this.fuel;
    }

    @Override
    public void Refuel() {
        this.fuel = 100.0;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Type='" + Type + '\'' +
                ", ID='" + ID + '\'' +
                ", fuel=" + fuel +
                ", capacity=" + capacity +
                ", containers=" + containers +
                '}';
    }
}
