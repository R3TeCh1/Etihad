package etihad;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Alex
 * @version 30.09.2023
 */
public class Passenger {
  private String name;
  private Seat seat;
  private Set<Flight> flights = new HashSet<Flight>();

  public void addFlight(Flight f){ flights.add(f); }

  //Konstruktor--------------------------------------------------------
  public Passenger(String name, Seat seat){
    this.name = name;
    this.seat = seat;
  }

  //Getter--------------------------------------------------------
  public String getName(){
    return name;
  }

  public Seat getSeat() {
    return seat;
  }

  public Set<Flight> getFlights() {
    return flights;
  }

  //Setter--------------------------------------------------------
  public void setName(String name){
    this.name = name;
  }

  public void setSeat(Seat seat){

    this.seat = seat;
  }

  public void setFlights(Set<Flight> flights){
    this.flights = flights;
  }

  //SHOW--------------------------------------------------------

  public void show(){
    System.out.print("" + this.name + " on ");
    this.seat.show();
  }
  //TOSTRING--------------------------------------------------------
  @Override
  public String toString(){
    return getClass().getSimpleName() + " " + name + " | " + seat.toString();
  }
}
