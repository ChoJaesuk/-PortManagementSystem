package assignment.truck;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Truck implements Serializable {
    double Capacity;
    String Id;
    String Type;


    public Truck(double Capacity, String Id, String Type) {
        this.Id = Id;
        this.Capacity = Capacity;
        this.Type = Type;
    }


    @Override
    public String toString() {
        return "Port [Id:" + Id + ", Capacity:" + Capacity +", Type:" + Type + ";]";
    }
}
