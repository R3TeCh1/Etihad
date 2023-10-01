package etihad;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Nazanin
 * @version 30.09.2023
 */

public class Airport {

  private String name;
  private String iataCode;
  private City[] catchmentArea;
  Set<Flight> aSetOfdepartures = new HashSet<>();
  Set<Flight> aSetOfarrivals = new HashSet<>();


  //constructor
  public Airport(String name, String iataCode, City[] catchmentArea, Set<Flight> aSetOfdepartures, Set<Flight> aSetOfarrivals) {
    this.name = name;
    this.iataCode = iataCode;
    this.catchmentArea = catchmentArea;
    this.aSetOfdepartures = aSetOfdepartures;
    this.aSetOfarrivals = aSetOfarrivals;
    System.out.println(toString() + " created");
  }


  //Methods----------------------------------------------------------------
  public void deice(){
    System.out.println(toString() + " wurde enteist.");
  }
  //Getters----------------------------------------------------------------
  public String getName(){
    return name;
  }

  public String getIataCode(){
    return iataCode;
  }

  public Set<Flight> getASetOfdepartures() {
    return aSetOfdepartures;
  }

  public Set<Flight> getaSetOfarrivals() {
    return aSetOfarrivals;
  }

  public City[] getCatchmentArea() {
    return catchmentArea;
  }


  //Setters----------------------------------------------------------------
  public void setName(String name){
    this.name=name;
  }

  public void setIataCode(String iataCode){
    this.iataCode=iataCode;
  }


  public void setASetOfdepartures(Set<Flight> aSetOfdepartures) {
    this.aSetOfdepartures = aSetOfdepartures;
  }

  public void setASetOfarrivals(Set<Flight> aSetOfarrivals) {
    this.aSetOfarrivals = aSetOfarrivals;
  }

  // Setter für Verknüpfung mit City
  public void setCatchmentArea(City[] catchmentArea) {
    this.catchmentArea = catchmentArea;
    System.out.println("Airport " + name + " is linked to City " + catchmentArea[0].getName());
  }

  // Methode zum Hinzufügen eines Flugs zu den Abflügen
  public void addDepartureFlight(Flight flight) {
    aSetOfdepartures.add(flight);
    System.out.println("Flight " + flight.getFlightNum() + " is departing from Airport " + name);
  }

  // Methode zum Hinzufügen eines Flugs zu den Ankünften
  public void addArrivalFlight(Flight flight) {
    aSetOfarrivals.add(flight);
    System.out.println("Flight " + flight.getFlightNum() + " is arriving at Airport " + name);
  }


//toString
  @Override
  public String toString() {
    return getClass().getSimpleName() + "[name=" + name + ", iataCode=" + iataCode + "]";
  }
}
