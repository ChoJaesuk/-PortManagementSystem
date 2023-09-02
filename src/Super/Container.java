package Super;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Container implements Serializable {
    private String ID;
    private String Type;
    private Double Weight;
    private Double consumptionFuel;

    protected ArrayList<String> Types = new ArrayList<>(List.of(new String[]{"dry storage", "open top", "open side", "refrigerated", "liquid"}));
    public Container(){
        this.ID = null;
        this.Type = null;
        this.Weight = null;
        this.consumptionFuel = null;
    }

    public void setType(String type) {
        if(InTypes(type) == true){
            this.Type = Type;
        }
    }

    public boolean InTypes(String Type) {
        if(Types.contains(Type)){
            return true;
        }
        return false;
    }
    public Container(String ID, String type, Double Weight){
        if(InTypes(type) == true){
            this.ID = ID;
            this.Type = type;
            this.Weight = Weight;
        }


    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Container{" +
                "ID='" + ID + '\'' +
                ", Type='" + Type + '\'' +
                ", Weight=" + Weight +
                ", consumptionFuel=" + consumptionFuel +
                '}';
    }
}
