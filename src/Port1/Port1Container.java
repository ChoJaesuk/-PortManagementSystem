package Port1;
import Super.Container;
import Super.Save;

import java.util.ArrayList;
import java.util.List;

public class Port1Container extends Container implements Save {
    private String ID;
    private String Type;
    private Double Weight;
    private Double consumptionFuel;
    Port1Container(){}
    protected ArrayList<String> Types = new ArrayList<>(List.of(new String[]{"dry storage", "open top", "open side", "refrigerated", "liquid"}));

    public Port1Container(String ID, String type, Double Weight){
        if(InTypes(type)){
            this.ID = ID;
            this.Type = type;
            this.Weight = Weight;
            save("/src/Port1/Data",""+this.ID,this);
        }else{
            System.out.println("Your type is not include in container's type.");
        }


    }


    public String getID() {
        return ID;
    }

    @Override
    public void setType(String type) {
        if(InTypes(type)){
            this.Type = type;
        }
    }

    @Override
    public boolean InTypes(String Type) {
        return super.InTypes(Type);
    }

    Port1Container(String ID, String Type, Double Weight,Double consumptionFuel){
        this.ID = ID;
        this.Type = Type;
        this.Weight = Weight;
        this.consumptionFuel = consumptionFuel;
    }
    public void SavePort1Container(String filepath, String ObjectID, Container container ){

    }

    @Override
    public void save(String filepath, String ObjectID, Object obj) {
        Save.super.save(filepath, ObjectID, obj);
    }
}


