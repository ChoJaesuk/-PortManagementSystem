package Port1;

import Super.Container;
import Super.Save;
import Super.Ship;
import Super.Vehicle;

import java.util.ArrayList;

public class Port1Ship extends Ship implements Save {
    private String ID;
    private Double fuel;
    private Double capacity;
    private ArrayList<Container> containers;

    public Port1Ship(){
        this.ID = null;
        this.fuel = 100.0;
        this.capacity = null;
        this.containers = null;
    }
    public Port1Ship(String ID, Double capacity){
        this.ID = ID;
        this.capacity = capacity;
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
        return fuel;
    }

    @Override
    public void Refuel() {
        this.fuel = 100.0;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "ID='" + ID + '\'' +
                ", fuel=" + fuel +
                ", capacity=" + capacity +
                ", containers=" + containers +
                '}';
    }

    @Override
    public void save(String PortNum, String ObjectID, Object obj) {
        Save.super.save(PortNum, ObjectID, obj);
    }
}
