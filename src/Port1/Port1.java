package Port1;
import Super.*;
public class Port1 extends Port implements Save{
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
        this.LandingAbility = LandingAbility;
        save("/src/Port1/Data","Port1",this);
    }
    public String Port1PrintAllFilesStartWith(String startWord){
        return printAllFilesStartWith(startWord,"/src/Port1/Data");
    }
    public String printAllTrucks(){
        return Port1PrintAllFilesStartWith("T-");
    }
    public String printAllContainers(){
        return Port1PrintAllFilesStartWith("C-");
    }
    public String printAllShips(){
        return Port1PrintAllFilesStartWith("S-");
    }
    public void printAllVehicles(){
        System.out.println("--------Trucks-------");
        System.out.println(Port1PrintAllFilesStartWith("T-"));
        System.out.println("--------Ships--------");
        System.out.println(Port1PrintAllFilesStartWith("S-"));
    }



    }
