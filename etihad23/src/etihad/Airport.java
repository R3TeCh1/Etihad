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
  private City[] infrastructure;
  private Set<City> cities = new HashSet<>();
  Set<Flight> aSetOfdepartures = new HashSet<Flight>();
  Set<Flight> aSetOfarrivals = new HashSet<Flight>();




  //constructor
  public Airport(String name, String iataCode) {
    this.name = name;
    this.iataCode = iataCode;
    System.out.println("Airport " + name + " created");
  }


  //Methods----------------------------------------------------------------
  public void deice(){


  }
  //Getters----------------------------------------------------------------
  public String getName(){
    return name;
  }

  public String getIataCode(){
    return iataCode;
  }

  public Set<City> getCities() {
    return cities;
  }

  public Set<Flight> getASetOfdepartures() {
    return aSetOfdepartures;
  }

  public Set<Flight> getaSetOfarrivals() {
    return aSetOfarrivals;
  }

  public City[] getInfrastructure() {
    return infrastructure;
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

  public void setInfrastructure(City[] infrastructure) {
    this.infrastructure = infrastructure;
    System.out.println("Airport " + name + " has the following infrastructure: " +Arrays.toString(infrastructure));
  }

  // Setter für Verknüpfung mit City
  public void setCatchmentArea(City[] catchmentArea) {
    this.catchmentArea = catchmentArea;
    System.out.println("Airport " + name + " is linked to City " + catchmentArea[0].getName());
  }

  // Methode zum Hinzufügen einer Stadt zum Airport
  public void addCity(City city) {
    cities.add(city);
    System.out.println("City " + city.getName() + " is linked to Airport " + name);
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
