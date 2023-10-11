package etihad;

import java.util.HashSet;
import java.util.Set;

/**
 * Die Klasse Airport repräsentiert einen Flughafen mit verschiedenen Eigenschaften wie Name, IATA-Code,
 * Einzugsgebiet (verknüpft mit einer Stadt), Abflüge und Ankünfte von Flügen.
 *
 * @author Nazanin
 * @version 11.10.2023
 */
public class Airport {

  private String name;
  private String iataCode;
  private City[] catchmentArea;
  Set<Flight> departures = new HashSet<>();
  Set<Flight> arrivals = new HashSet<>();


  /**
   * Konstruktor für die Airport-Klasse mit mehreren Flugzeugen und Ankunft / Abflug-Sets.
   *
   * @param name Der Name des Flughafens.
   * @param iataCode Der IATA-Code des Flughafens.
   * @param catchmentArea Das Einzugsgebiet des Flughafens, in Form einer Stadt.
   * @param departures Die Menge der abfliegenden Flüge.
   * @param arrivals Die Menge der ankommenden Flüge.
   */
  public Airport(String name, String iataCode, City[] catchmentArea, Set<Flight> departures, Set<Flight> arrivals) {
    this.name = name;
    this.iataCode = iataCode;
    this.catchmentArea = catchmentArea;
    this.departures = departures;
    this.arrivals = arrivals;
    System.out.println(toString() + " created");
  }

  /**
   * Konstruktor für die Airport-Klasse mit einer Stadt als Einzugsgebiet.
   *
   * @param name Der Name des Flughafens.
   * @param iataCode Der IATA-Code des Flughafens.
   * @param catchmentArea Die Stadt, die das Einzugsgebiet des Flughafens darstellt.
   */
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

  public void show(boolean isDeparture) {
    String n = isDeparture? "Departing " : "Arriving ";
    System.out.print(n + name + " (" + iataCode + ")");
    catchmentArea[0].show();
  }

  //toString
  @Override
  public String toString() {
    return getClass().getSimpleName() + "[name=" + name + ", iataCode=" + iataCode + "]";
  }
}
