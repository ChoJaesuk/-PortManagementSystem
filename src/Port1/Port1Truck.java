package Port1;
import Super.Container;

import Super.Truck;
import Super.Save;
import java.util.ArrayList;


public class Port1Truck extends Truck implements Save {
    private String Type;
    private String ID;
    private Double fuel = 100.0;
    private Double capacity;
    private ArrayList<Container> containers;
    public Port1Truck(){};
    public Port1Truck(String ID, Double capacity){
        this.ID = ID;
        this.capacity = capacity;
        save("/src/Port1/Data",""+this.ID,this);
    }
    @Override
    public Double FuelConsumption(Double consumption) {
        return this.FuelConsumption(consumption);
    }

    @Override
    public void loadContainer(Container container) {
        this.loadContainer(container);
    }

    @Override
    public void Refuel() {
        this.Refuel();
    }

    @Override
    public void save(String filepath, String ObjectID, Object obj) {
        Save.super.save(filepath, ObjectID, obj);
    }
}
