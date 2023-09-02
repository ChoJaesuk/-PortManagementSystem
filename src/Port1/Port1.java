package Port1;
import Super.*;
public class Port1 extends Port{
    private String Name;
    private String ID;
    private Double StoringCapacity;
    private Double Longtitude;
    private Double Latitude;
    private boolean LandingAbility;
    public Port1(){
        Name = null;
        ID = null;
        StoringCapacity = null;

    }
    public Port1(String Name, String ID, Double StoringCapacity, Double Longtitude, Double Latitude, boolean LandingAbility){
        this.Name = Name;
        this.ID = ID;
        this.StoringCapacity = StoringCapacity;
        this.Longtitude = Longtitude;
        this.Latitude = Latitude;
        this.StoringCapacity = StoringCapacity;
    }
}
