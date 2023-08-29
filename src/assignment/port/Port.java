package assignment.port;

import java.io.Serializable;

class Port implements Serializable {
    String name;
    String Id;
    double storingCapacity;
    double longitude;
    double latitude;
    boolean landingAbility;

    public Port(String name, String Id, double storingCapacity, double longitude, double latitude, boolean landingAbility) {
        this.name = name;
        this.Id = Id;
        this.storingCapacity = storingCapacity;
        this.longitude = longitude;
        this.latitude = latitude;
        this.landingAbility = landingAbility;
    }


    @Override
    public String toString() {
        return "Port [name:" + name + ", Id:" + Id + ", storingCapacity:" + storingCapacity + ", longitude:" + longitude + ", latitude:" + latitude + " + landingAbility: + " + landingAbility +";]";
    }
}