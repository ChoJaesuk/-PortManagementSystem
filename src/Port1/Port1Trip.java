package Port1;

import Super.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;


public class Port1Trip extends Trip{
    private String ID;
    private LocalDate DepartureDate;
    private LocalDate ArrivalDate;
    private String VehicleID;
    private String Status;
    private Port DeparturePort;
    private Port ArrivalPort;
    private ArrayList<Container> Containers;

    public Port1Trip(){
        ID = null;
        DepartureDate = null;
        ArrivalDate = null;
        VehicleID = null;
        Status = null;
        DeparturePort = null;
        ArrivalPort = null;
    }
    public Port1Trip(String ID, LocalDate DepartureDate, LocalDate ArrivalDate, Vehicle Vehicle, Port DeparturePort, Port ArrivalPort){
        this.ID = ID;
        this.DepartureDate = DepartureDate;
        this.ArrivalDate = ArrivalDate;
        this.VehicleID = Vehicle.ID;
        this.DeparturePort = DeparturePort;
        this.ArrivalPort = ArrivalPort;
        this.Containers = Vehicle.Containers;
        Port1MoveFile(""+VehicleID,""+ArrivalPort);
        for(Container container :Containers){
            String ContainerID = container.getID();
            Port1MoveFile(""+ContainerID+".txt",""+ArrivalPort);
        }
    }

    @Override
    public String toString() {
        return "Port1Trip{" +
                "ID='" + ID + '\'' +
                ", DepartureDate=" + DepartureDate +
                ", ArrivalDate=" + ArrivalDate +
                ", VehicleID='" + VehicleID + '\'' +
                ", Status='" + Status + '\'' +
                ", DeparturePort=" + DeparturePort +
                ", ArrivalPort=" + ArrivalPort +
                ", Containers=" + Containers +
                '}';
    }
    public void Port1MoveFile(String fileName, String ArrivalPortName){
        moveFile("Port1",fileName,ArrivalPortName);
    }


    @Override
    public void save() throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter("/src/Port1/Data/History.txt", true));
        output.println(this);
        output.flush();
        output.close();
    }
}
