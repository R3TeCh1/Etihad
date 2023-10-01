package etihad;
/**
 * @author David Rischow
 * @version 30.09.2023
 */
public class Seat {
    String location;

    boolean reservation;

    Plane plane;

    public Seat(String location, Plane plane) {
        this.location = location;
        this.plane = plane;
    }

    public String reserve() {
        if (reservation) {
            return "Seat is already reserved by someone";
        } else {
            reservation = true;
            return "Seat reserved";
        }
    }
}
