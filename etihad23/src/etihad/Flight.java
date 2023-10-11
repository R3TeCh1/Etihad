package etihad;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Die Klasse Flight repräsentiert einen Flug mit verschiedenen Eigenschaften wie Datum, Flugnummer,
 * Herkunfts- und Zielorte, Airline, Piloten und Flugzeug.
 *
 * @author Kadir Erzurum
 * @version 11.10.2023
 */
public class Flight {

  //DEKLARIEREN----------------------------------------------------------------

  //-date
  private LocalDate date;
  //-flightNum
  private String flightNum;
  //Airport
  private Airport origin;
  private Airport destination;
  //Airline
  private Airline organizer;
  //Pilot
  private Pilot captain;
  private Pilot coPilot;
  private Pilot flightEngineer;
  //Plane
  private Plane vehicle;
  //BoardingCard
  private List<BoardingCard> boardingCards = new ArrayList<>();
  private static final int MAX_BOARDINGCARD = 853;

  /**
   * Konstruktor für die Klasse Flight.
   *
   * @param date Das Datum des Fluges.
   * @param flightNum Die Flugnummer.
   * @param origin Die Flughäfen des Ursprungs.
   * @param destination Die Flughäfen des Ziels.
   * @param organizer Die Fluggesellschaft (Airline).
   * @param captain Der Kapitän des Fluges.
   * @param coPilot Der Co-Pilot des Fluges.
   * @param vehicle Das Flugzeug, das für den Flug verwendet wird.
   */
  public Flight(LocalDate date, String flightNum, Airport origin, Airport destination, Airline organizer, Pilot captain, Pilot coPilot, Plane vehicle){
    this.date = date;
    this.flightNum = flightNum;
    this.origin = origin;
    this.destination = destination;
    this.organizer = organizer;
    this.captain = captain;
    this.coPilot = coPilot;
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
    System.out.println("Der Flug " + toString() + " " + " wurde storniert.");
  }

  public void addBoardingCard(List<BoardingCard> boardingCards) {
    for (BoardingCard boardingCard : boardingCards) {
      if (this.boardingCards.size() < MAX_BOARDINGCARD) {
        Passenger passenger = boardingCard.getPassenger();
        this.boardingCards.add(boardingCard);
        System.out.println(toString() + " wurde zum Passagier " + passenger.getName());
      } else {
        System.out.println("Der Flug ist ausgebucht, es können keine weiteren Boarding Cards hinzugefügt werden.");
      }
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

  /**
   * Generiert eine zufälliges Boardind Card ID, bestehend aus einer Zahl, welches 15 Stellen hat.
   *
   * @return Die zufällige ID.
   */
  public BigInteger generateBoardingCardID() {
    Random random = new Random();
    StringBuilder numberString = new StringBuilder("1");
    for (int i = 2; i <= 15; i++) {
      int digit = random.nextInt(10);
      numberString.append(digit);
    }
    return new BigInteger(numberString.toString());
  }

  /**
   * Generiert ein zufälliges Gate, bestehend aus einem Buchstaben und einer Zahl von 1 bis 99.
   *
   * @return Das zufällige Gate.
   */
  public String generateRandomGate() {
    Random random = new Random();
    char letter = (char) ('A' + random.nextInt(26));
    int number = random.nextInt(99) + 1;
    return letter + String.valueOf(number);
  }

  /**
   * Generiert eine zufälliges Zeit, bestehend aus Stunden und Minuten.
   *
   * @return Die zufällige Zeit.
   */
  public String generateRandomTime() {
    Random random = new Random();
    int hours = random.nextInt(24);
    int minutes = random.nextInt(60);
    return String.format("%02d:%02d", hours, minutes);
  }

  //GETTER----------------------------------------------------------------

  public LocalDate getDate(){
    return date;
  }

  public String getFlightNum(){
    return flightNum;
  }

  public Airport getOrigin(){
    return origin;
  }

  public Airport getDestination(){
    return destination;
  }

  public Airline getOrganizer(){
    return organizer;
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

  /**
   * Gibt die Boarding Cards für diesen Flug zurück.
   *
   * @return Eine Liste von Boarding Cards für den Flug.
   */
  public List<BoardingCard> getBoardingCards() {
    return boardingCards;
  }

  //SETTER----------------------------------------------------------------

  public void setDate(LocalDate date){
    this.date = date;
  }

  public void setFlightNum(String flightNum){
    this.flightNum = flightNum;
  }

  public void setOrigin(Airport origin){
    this.origin = origin;
  }

  public void setDestination(Airport destination){
    this.destination = destination;
  }

  public void setOrganizer(Airline organizer){
    this.organizer = organizer;
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

  public void setBoardingCards(List<BoardingCard> boardingCards) {
    this.boardingCards = boardingCards;
  }

  //SHOW----------------------------------------------------------------
  public void show(){
    System.out.println(toString() + " " + "on " + date);
    System.out.print("Offered by ");
    organizer.show();
    System.out.print("Flown by ");
    captain.show(true);
    System.out.print(" [and ");
    coPilot.show(false);
    System.out.print("]\n");
    origin.show(true);
    destination.show(false);
    vehicle.show();
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    for (BoardingCard boardingCard : boardingCards) {
      Passenger passenger = boardingCard.getPassenger();
      System.out.print("Carrying Passenger: ");
      System.out.println(passenger.getName());
      System.out.print("Boarding Card: ");
      boardingCard.show();
    }
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
