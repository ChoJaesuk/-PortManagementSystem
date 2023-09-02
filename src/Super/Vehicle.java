package Super;

import java.util.ArrayList;

public abstract class Vehicle {
    public String ID;
    public ArrayList<Container> Containers;

    abstract void loadContainer(Container container);

    abstract void unloadContainer(Container container);

    abstract Double getFuel();

    abstract Double FuelConsumption(Double consumption);

    abstract void Refuel();

}
