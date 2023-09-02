package Port1;
import Super.Container;

import Super.Truck;
import Super.Save;
import java.util.ArrayList;


public class Port1Truck extends Truck implements Save {
    private String Type;
    private String ID;
    private Double fuel;
    private Double capacity;
    private ArrayList<Container> containers;
    public Port1Truck(){
        fuel = 100.0;
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
