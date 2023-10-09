package etihad;
/**
 * @author David Rischow
 * @version 30.09.2023
 */
public class Seat {

    private final int row;
    private final char place;
    private boolean reservation;
    private final Plane plane;
    private Passenger passenger;


    /**
     *
     * @param row: int, Reihe
     * @param place: char, Genauer Platz in der Reihe
     * @param plane: Plane, das Flugzeug, in welchem Sitz verbaut ist.
     */
    public Seat(int row, char place, Plane plane) {
        this.row = row;
        this.place = place;
        this.plane = plane;
        System.out.println(toString() + " created");
    }

    public Seat(Seat s){
        this.row = s.getRow();
        this.place = s.getPlace();
        this.plane = s.getPlane();
        //this.passenger = s.getPassenger();
        //this.reservation = s.getReservation();
    }
    public int getRow() {
        return row;
    }

    public char getPlace() {
        return place;
    }

    public boolean isReservation() {
        return reservation;
    }

    public Plane getPlane() {
        return plane;
    }

    public void reserve() {
        if (reservation) {
            System.out.println(toString() + " is already reserved by someone");
        } else {
            reservation = true;
            System.out.println(toString() + " reserved");
        }
    }

    public String getReservation(){
        if(reservation) {
            return toString() + "is reserved by " + passenger.getName();
        } else {
            return toString() + "is not reserved";
        }
    }

    public void getPassenger() {
        System.out.println(toString() + " is reserved by " +this.passenger.getName());
    }

    public void setReservation(Passenger passenger) {
        if (reservation) {
            System.out.println(toString() + "Seat is already reserved");
            return;
        }
        if (passenger == null) {
            this.reservation = false;
            this.passenger = null;
            System.out.println(toString() + "Reservation cancelled.");
        } else {
            this.reservation = true;
            this.passenger = passenger;
        }

    };

    public String toString() {
        return getClass().getSimpleName() +", " + this.row + this.place;
    }

    public void show() {
        System.out.println(toString());
    }
}
