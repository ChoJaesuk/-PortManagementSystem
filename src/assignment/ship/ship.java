package assignment.ship;

import java.io.Serializable;

class Ship implements Serializable {
    double Capacity;
    String Id;


    public Ship(double Capacity, String Id) {
        this.Id = Id;
        this.Capacity = Capacity;
    }


    @Override
    public String toString() {
        return "Port [Id:" + Id + ", Capacity:" + Capacity +";]";
    }
}
