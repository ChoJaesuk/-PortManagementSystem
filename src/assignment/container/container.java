package assignment.container;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Container implements Serializable {
    String name;
    String Id;
    String type;
    double weight;
    double consumptionFuel;

    public Container(String name, String Id, String type, double weight, double consumptionFuel) {
        this.name = name;
        this.Id = Id;
        this.type = type;
        this.weight = weight;
        this.consumptionFuel = consumptionFuel;
    }


    @Override
    public String toString() {
        return "Container [name:" + name + ", Id:" + Id + ", type:" + type + ", weight:" + weight + ", consumptionFuel:" + consumptionFuel + "]";
    }
}

