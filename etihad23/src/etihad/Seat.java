package etihad;
/**
 * @author David Rischow
 * @version 30.09.2023
 */
public class Seat {

    final int row;
    final char place;

    boolean reservation;
    final Plane plane;

    public Seat(int row, char place, boolean reservation, Plane plane) {
        this.row = row;
        this.place = place;
        this.reservation = reservation;
        this.plane = plane;
        System.out.println(toString() + " created");
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
            return toString() + "is reserved";
        } else {
            return toString() + "is not reserved";
        }
    }

    public String toString() {
        return getClass().getSimpleName() +", "+ this.place + this.row + " in " + plane.tailNr;
    }

}
