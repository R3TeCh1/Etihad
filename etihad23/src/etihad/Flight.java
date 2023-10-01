package etihad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kadir Erzurum
 * @version 30.09.2023
 */
public class Flight {

  //DEKLARIEREN----------------------------------------------------------------

  //-date
  private LocalDate date;
  //-flightNum
  private String flightNum;
  //Airport
  private Airport[] origin;
  private Airport[] destination;
  //Airline
  private Airline organizer;
  //Passenger
  private List<Passenger> passengers = new ArrayList<>();
  private static final int MAX_PASSENGERS = 853;
  //Pilot
  private Pilot captain;
  private Pilot coPilot;
  private Pilot flightEngineer;
  //Plane
  private Plane vehicle;


  //Konstruktor
  public Flight(LocalDate date, String flightNum, Airport [] origin, Airport [] destination, Airline organizer, List<Passenger> passengers, Pilot captain, Pilot coPilot, Pilot flightEngineer, Plane vehicle){
    this.date = date;
    this.flightNum = flightNum;
    this.origin = origin;
    this.destination = destination;
    this.organizer = organizer;
    this.passengers.addAll(passengers);
    this.captain = captain;
    this.coPilot = coPilot;
    this.flightEngineer = flightEngineer;
    this.vehicle = vehicle;

    System.out.println(toString() + " created");
  }

  //METHODEN----------------------------------------------------------------
  //+refuel
  public void refuel(){
    System.out.println(toString() + " wurde betankt.");
  }

  //+takeOff
  public void takeOff(){
    System.out.println(toString() + " ist abgehoben");
  }

  //+land
  public void land(){
    System.out.println(toString() + " ist gelandet.");
  }

  //+delay
  public void delay(LocalDate delayedTo){
    setDate(delayedTo);
    System.out.println(toString() + " verspätet sich - Neue Zeit: " + delayedTo);
  }

  //+cancel
  public void cancel(){
    System.out.println("Der Flug " + toString() + flightNum + " wurde storniert.");
  }

  public void addPassenger(Passenger passenger) {
    if (passengers.size() < MAX_PASSENGERS) {
      passengers.add(passenger);
      System.out.println(toString() + " wurde zum Passagier " + passenger.getName());
    } else {
      System.out.println("Der Flug ist ausgebucht, es können keine weiteren Passagiere hinzugefügt werden.");
    }
  }

  public void assignCaptain(Pilot captain) {
    this.captain = captain;
    System.out.println(toString() + " wurde zum Kapitän " + captain.getName());
  }

  public void assignCoPilot(Pilot coPilot) {
    this.coPilot = coPilot;
    System.out.println(toString() + " wurde zum Co-Pilot " + coPilot.getName());
  }

  public void assignFlightEngineer(Pilot flightEngineer) {
    this.flightEngineer = flightEngineer;
    System.out.println(toString() + " wurde zum Flugingenieur" + flightEngineer.getName());
  }

  public void assignAirline(Airline airline) {
    this.organizer = airline;
    System.out.println(toString() + " wurde zur Airline " + airline.getName());
  }

  public void startFlight() {
    System.out.println(toString() + " hat den Flug erfolgreich gestartet.");
  }

  public void finishFlight() {
    System.out.println(toString() + " hat den Flug erfolgreich beendet.");
  }


  //GETTER----------------------------------------------------------------

  public LocalDate getDate(){
    return date;
  }

  public String getFlightNum(){
    return flightNum;
  }

  public Airport[] getOrigin(){
    return origin;
  }

  public Airport[] getDestination(){
    return destination;
  }

  public Airline getOrganizer(){
    return organizer;
  }

  public List<Passenger> getPassengers(){
    return passengers;
  }

  public Pilot getCaptain(){
    return captain;
  }

  public Pilot getCoPilot(){
    return coPilot;
  }

  public Pilot getFlightEngineer(){
    return flightEngineer;
  }

  public Plane getVehicle(){
    return vehicle;
  }

  //SETTER----------------------------------------------------------------

  public void setDate(LocalDate date){
    this.date = date;
  }

  public void setFlightNum(String flightNum){
    this.flightNum = flightNum;
  }

  public void setOrigin(Airport[] origin){
    this.origin = origin;
  }

  public void setDestination(Airport[] destination){
    this.destination = destination;
  }

  public void setOrganizer(Airline organizer){
    this.organizer = organizer;
  }

  public void setPassenger(List<Passenger> passengers){
    this.passengers = passengers;
  }

  public void setCaptain(Pilot captain){
    this.captain = captain;
  }

  public void setCoPilot(Pilot coPilot){
    this.coPilot = coPilot;
  }

  public void setFlightEngineer(Pilot flightEngineer){
    this.flightEngineer = flightEngineer;
  }

  public void setVehicle(Plane vehicle){
    this.vehicle = vehicle;
  }

  //TOSTRING--------------------------------------------------------
  @Override
  public String toString(){
    return getClass().getSimpleName() + " " + flightNum;
  }
}
