package etihad;

import java.time.LocalDate;

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
  private Passenger[] passenger;
  private int passengerCounter = 0;
  //Pilot
  private Pilot captain;
  private Pilot coPilot;
  private Pilot flightEngineer;
  //Plane
  private Plane vehicle;


  //Konstruktor
  public Flight(LocalDate date, String flightNum, Airport [] origin, Airport [] destination, Airline organizer, Passenger [] passenger, Pilot captain, Pilot coPilot, Pilot flightEngineer, Plane vehicle){
    this.date = date;
    this.flightNum = flightNum;
    this.origin = origin;
    this.destination = destination;
    this.organizer = organizer;
    this.passenger = new Passenger[853];
    for (int i = 0; i < passenger.length; i++) {
      this.passenger[i] = passenger[i];
    }
    this.captain = captain;
    this.coPilot = coPilot;
    this.flightEngineer = flightEngineer;
    this.vehicle = vehicle;
  }

  //METHODEN----------------------------------------------------------------

  //+refuel
  public void refuel(){
    System.out.println("Flugzeug wurde getankt.");
  }

  //+takeOff
  public void takeOff(){
    System.out.println("Flugzeug ist abgehoben");
  }

  //+land
  public void land(){
    System.out.println("Flugzeug ist gelandet.");
  }

  //+delay
  public void delay(LocalDate delayedTo){
    setDate(delayedTo);
    System.out.println(toString() + " verspätet sich - Neue Zeit: " + delayedTo);
  }

  //+cancel
  public void cancel(){
    System.out.println("Flug " + flightNum + " wurde storniert.");
  }

  public void addPassenger(Passenger... passengers) {
    for (Passenger passenger : passengers) {
      if (passengerCounter < this.passenger.length) {
        this.passenger[passengerCounter] = passenger;
        passengerCounter++;
      } else {
        System.out.println("Der Flug ist ausgebucht, es können keine weiteren Passagiere hinzugefügt werden.");
      }
    }
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

  public Passenger[] getPassenger(){
    return passenger;
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

  public void setPassenger(Passenger[] passenger){
    this.passenger = passenger;
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
