package etihad;

import java.util.Objects;

/**
 * @author David Rischow
 * @version 30.09.2023
 */
public class Plane {

    String model;
    String searialNum;
    int hoursFlown;
    String tailNr;

    Airline airline;

    String status = "onLand";

    Seat[] seats;

    public Plane(String model, String searialNum, int hoursFlown, String tailNr) {
        this.model = model;
        this.searialNum = searialNum;
        this.hoursFlown = hoursFlown;
        this.tailNr = tailNr;
    }


    public String rent(Airline airLine) {
        if (airline == null) {
            this.airline = airLine;
            return "Airplane is now rent by" + airline.getName();
        } else {
            return "Airplane is already rent by" + airline.getName();
        }
    }

    public String clean() {
        return "Airplane" + this.tailNr + "cleaned";
    };

    public String refuel() {
        return "Airplane" + this.tailNr + "was refueld";
    };

    public String takeOff() {
        if(Objects.equals(status, "onLand")) {
            this.status = "inAir";
            return "Airplane" + this.tailNr + "took off";
        } else {
            return "Airplane" + this.tailNr + "is already in the air.";
        }
    };

    public String land() {
        if(Objects.equals(status, "inAir")) {
            this.status = "onLand";
            return "Airplane" + this.tailNr + "landed";
        } else {
            return "Airplane" + this.tailNr + "is already on the floor.";
        }
    };


}
