package etihad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Die Klasse Flight repräsentiert einen Flug mit verschiedenen Eigenschaften wie Datum, Flugnummer,
 * Herkunfts- und Zielorte, Airline, Passagierliste, Piloten und Flugzeug.
 *
 * @author Kadir Erzurum
 * @version 01.10.2023
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


  /**
   * Konstruktor für die Klasse Flight.
   *
   * @param date Das Datum des Fluges.
   * @param flightNum Die Flugnummer.
   * @param origin Die Flughäfen des Ursprungs.
   * @param destination Die Flughäfen des Ziels.
   * @param organizer Die Fluggesellschaft (Airline).
   * @param passengers Die Liste der Passagiere.
   * @param captain Der Kapitän des Fluges.
   * @param coPilot Der Co-Pilot des Fluges.
   * @param flightEngineer Der Flugingenieur des Fluges.
   * @param vehicle Das Flugzeug, das für den Flug verwendet wird.
   */
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

  /**
   * Betankt das Flugzeug.
   */
  public void refuel(){
    System.out.println(toString() + " wurde betankt.");
  }

  /**
   * Lässt das Flugzeug abheben.
   */
  public void takeOff(){
    System.out.println(toString() + " ist abgehoben");
  }

  /**
   * Lässt das Flugzeug landen.
   */
  public void land(){
    System.out.println(toString() + " ist gelandet.");
  }

  /**
   * Verzögert den Flug auf das angegebene Datum.
   *
   * @param delayedTo Das neue Datum für die Verspätung.
   */
  public void delay(LocalDate delayedTo){
    setDate(delayedTo);
    System.out.println(toString() + " verspätet sich - Neue Zeit: " + delayedTo);
  }

  /**
   * Storniert den Flug.
   */
  public void cancel(){
    System.out.println("Der Flug " + toString() + " " + flightNum + " wurde storniert.");
  }

  /**
   * Fügt einen Passagier zur Passagierliste hinzu.
   *
   * @param passenger Der hinzuzufügende Passagier.
   */
  public void addPassenger(Passenger passenger) {
    if (passengers.size() < MAX_PASSENGERS) {
      passengers.add(passenger);
      System.out.println(toString() + " wurde zum Passagier " + passenger.getName());
    } else {
      System.out.println("Der Flug ist ausgebucht, es können keine weiteren Passagiere hinzugefügt werden.");
    }
  }

  /**
   * Weist dem Flug einen Kapitän zu.
   *
   * @param captain Der zuzuweisende Kapitän.
   */
  public void assignCaptain(Pilot captain) {
    this.captain = captain;
    captain.book(this); // Hier wird der Flug dem Kapitän zugewiesen
    System.out.println(toString() + " wurde zum Kapitän " + captain.getName());
  }

  /**
   * Weist dem Flug einen Co-Piloten zu.
   *
   * @param coPilot Der zuzuweisende Co-Pilot.
   */
  public void assignCoPilot(Pilot coPilot) {
    this.coPilot = coPilot;
    coPilot.book(this); // Hier wird der Flug dem Co-Piloten zugewiesen
    System.out.println(toString() + " wurde zum Co-Pilot " + coPilot.getName());
  }

  /**
   * Weist dem Flug einen Flugingenieur zu.
   *
   * @param flightEngineer Der zuzuweisende Flugingenieur.
   */
  public void assignFlightEngineer(Pilot flightEngineer) {
    this.flightEngineer = flightEngineer;
    flightEngineer.book(this); // Hier wird der Flug dem Flugingenieur zugewiesen
    System.out.println(toString() + " wurde zum Flugingenieur " + flightEngineer.getName());
  }

  /**
   * Weist dem Flug eine Airline zu.
   *
   * @param airline Die zuzuweisende Airline.
   */
  public void assignAirline(Airline airline) {
    this.organizer = airline;
    System.out.println(toString() + " wurde zur Airline " + airline.getName());
  }

  /**
   * Startet den Flug und gibt eine Erfolgsmeldung aus.
   */
  public void startFlight() {
    System.out.println(toString() + " hat den Flug erfolgreich gestartet.");
  }

  /**
   * Beendet den Flug und gibt eine Erfolgsmeldung aus.
   */
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
  /**
   * Gibt eine Zeichenfolge zurück, die den Klassennamen und die Flugnummer darstellt.
   *
   * @return Eine Zeichenfolge im Format "Klassenname Flugnummer".
   */
  @Override
  public String toString(){
    return getClass().getSimpleName() + " " + flightNum;
  }
}
