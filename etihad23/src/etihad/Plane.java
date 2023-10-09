package etihad;

import java.util.Collections;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

/**
 * @author David Rischow
 * @version 30.09.2023
 */
public class Plane {
    private final String model;
    private final String serialNum;
    private int hoursFlown;
    private String tailNr;
    private Airline rentAirline;
    private Airline reserveAirline;
    private String status = "onLand";
    private List<Seat> seats = new ArrayList<>();

    /**
     * @param model: String, Flugzeugmodell
     * @param serialNum: String, Serialnummer des FLugzeugs
     * @param tailNr: String, Flugzeugbezeichnung
     */
    public Plane(String model, String serialNum, String tailNr) {
        this.model = model;
        this.serialNum = serialNum;
        this.tailNr = tailNr;
        this.addSeat(new Seat(23, 'A', this));
        System.out.println(toString() + " created");
    }

    //Airlines können mit "rent" das Flugzeug mieten.
    public void rent(Airline airLine) {
            this.rentAirline = airLine;
            System.out.println(toString() + " is rent by " + airLine.getName());
    }

    public void reserve(Airline airLine) {
        this.reserveAirline = airLine;
        System.out.println(toString() + " is reserved by " + airLine.getName());
    };

    public void clean() {
        System.out.println(toString() + " cleaned");
    };

    public void refuel() {
        System.out.println(toString() + " refueled");
    };

    public void deice() {
        System.out.println(toString() + " deiced");
    };

    public void takeOff() {
        if(Objects.equals(status, "onLand")) {
            this.status = "inAir";
            System.out.println(toString() + " took off");
        } else {
            System.out.println(toString() + " already in the air");
        }
    };

    public void land() {
        if(Objects.equals(status, "inAir")) {
            this.status = "onLand";
            System.out.println(toString() + " already on the floor");
        } else {
            System.out.println(toString() + " landed");
        }
    };

    public void addSeat(Seat seat) {
        if (!seats.isEmpty()){
        for (Seat existingSeat : seats) {
            if (existingSeat.getRow() == seat.getRow() && existingSeat.getPlace() == seat.getPlace()) {
                System.out.println(toString() + ": "+ seat.getRow() + seat.getPlace() +" already exist");
                return;
            }
        }}
        seats.add(seat);
        System.out.println(toString() + ": seat added");
    }

    public void getSeat(int row, char place) {
        for (Seat seat : seats) {
            if (seat.getRow() == row && seat.getPlace() == place) {
                System.out.println(toString() + ", " + seat.toString());
                return;
            }
        }
        System.out.println(toString() + ": seat not found");
    }

    public String getModel() {
        return model;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public int getHoursFlown() {
        return hoursFlown;
    }

    public String getTailNr() {
        return tailNr;
    }

    public Airline getreserveAirline() {
        return reserveAirline;
    }

    public Airline getrentAirline() {
        return rentAirline;
    }

    public String getStatus() {
        return status;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setHoursFlown(int hoursFlown) {
        this.hoursFlown = hoursFlown;
    }

    public String toString() {
        return getClass().getSimpleName() +", "+ this.tailNr;
    }

    public void show() {
        System.out.println("using " +this.getTailNr() + " (" + this.getModel() + ") ");
    }
}


