package etihad;

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
  Set<Flight> departures = new HashSet<>();
  Set<Flight> arrivals = new HashSet<>();


  //constructor
  public Airport(String name, String iataCode, City[] catchmentArea, Set<Flight> departures, Set<Flight> arrivals) {
    this.name = name;
    this.iataCode = iataCode;
    this.catchmentArea = catchmentArea;
    this.departures = departures;
    this.arrivals = arrivals;
    System.out.println(toString() + " created");
  }

  public Airport(String name, String iataCode, City catchmentArea){
    this.name = name;
    this.iataCode = iataCode;
    this.catchmentArea = new City[1];
    this.catchmentArea[0] = catchmentArea;
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
    return departures;
  }

  public Set<Flight> getArrivals() {
    return arrivals;
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
    this.departures = aSetOfdepartures;
  }

  public void setASetOfarrivals(Set<Flight> aSetOfarrivals) {
    this.arrivals = aSetOfarrivals;
  }

  // Setter für Verknüpfung mit City
  public void setCatchmentArea(City[] catchmentArea) {
    this.catchmentArea = catchmentArea;
    System.out.println("Airport " + name + " is linked to City " + catchmentArea[0].getName());
  }

  // Methode zum Hinzufügen eines Flugs zu den Abflügen
  public void addDepartureFlight(Flight flight) {
    departures.add(flight);
    System.out.println("Flight " + flight.getFlightNum() + " is departing from Airport " + name);
  }

  // Methode zum Hinzufügen eines Flugs zu den Ankünften
  public void addArrivalFlight(Flight flight) {
    arrivals.add(flight);
    System.out.println("Flight " + flight.getFlightNum() + " is arriving at Airport " + name);
  }
//show methode
// departing Boryspil (KBP) near Kyiv
//arriving Gatwick Airport (GTW) near London
  public void show(boolean isDeparture) {
    String n = isDeparture? "Departing" : "Arriving";
    System.out.println(n + name + "near" + this.getCatchmentArea()[0]);
  }

  //toString
  @Override
  public String toString() {
    return getClass().getSimpleName() + "[name=" + name + ", iataCode=" + iataCode + "]";
  }
}
