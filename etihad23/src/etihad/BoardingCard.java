package etihad;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

/**
 * Die Klasse BoardingCard repräsentiert eine Boarding-Karte mit verschiedenen Eigenschaften
 * wie eine eindeutige ID, Gate-Informationen, Datum des Boardings, zugehöriger Passagier,
 * zugehöriger Flug, Sitzplatz und Uhrzeit.
 *
 * @author Kadir Erzurum
 * @version 11.10.2023
 */
public class BoardingCard {
  private BigInteger iDNumber;
  private String gate;
  private LocalDate boardingDay;
  private Passenger passenger;
  private Flight flight;
  private Seat seat;
  private String time;

  /**
   * Konstruktor für die BoardingCard-Klasse.
   *
   * @param iDNumber     Die eindeutige Identifikationsnummer der Boarding-Karte.
   * @param gate         Das Gate, an dem das Boarding stattfindet.
   * @param boardingDay  Das Datum des Boardings.
   * @param passenger    Der zugehörige Passagier.
   * @param seat         Der zugehörige Sitzplatz.
   * @param time         Die Uhrzeit des Boardings.
   */
  public BoardingCard(BigInteger iDNumber, String gate, LocalDate boardingDay, Passenger passenger, Seat seat, String time) {
    this.iDNumber = iDNumber;
    this.gate = gate;
    this.boardingDay = boardingDay;
    this.passenger = passenger;
    this.seat = seat;
    this.time = time;

    System.out.println(toString() + " created");
  }

  /**
   * Getter Methoden
   */
  public BigInteger getiDNumber() {
    return iDNumber;
  }

  public String getGate() {
    return gate;
  }

  public LocalDate getBoardingDay() {
    return boardingDay;
  }

  public Passenger getPassenger() {
    return passenger;
  }

  public Flight getFlight() {
    return flight;
  }

  public Seat getSeat() {
    return seat;
  }

  public String getTime() {
    return time;
  }

  /**
   * Setter Methoden
   */
  public void setiDNumber(BigInteger iDNumber) {
    this.iDNumber = iDNumber;
  }

  public void setGate(String gate) {
    this.gate = gate;
  }

  public void setBoardingDay(LocalDate boardingDay) {
    this.boardingDay = boardingDay;
  }

  public void setPassenger(Passenger passenger) {
    this.passenger = passenger;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public void setSeat(Seat seat) {
    this.seat = seat;
  }

  public void setTime(String time) {
    this.time = time;
  }

  /**
   * Fügt einen Passagier zur Passagierliste hinzu.
   *
   * @param passengers Der hinzuzufügende Passagier.
   */
  public void addPassenger(List<Passenger> passengers) {
    passengers.add(passenger);
  }

  /**
   * Fügt einen Flug zur Boarding-Karte hinzu, um die Zuordnung zu einem bestimmten Flug
   * zu ermöglichen.
   *
   * @param flight Der zugehörige Flug.
   */
  public void addFlight(Flight flight) {
    this.flight = flight;
  }


  /**
   * Zeigt Informationen zur Boarding-Karte, einschließlich der ID, des Datums, der Uhrzeit, des Gates
   * und des Sitzplatzes.
   */
  public void show() {
    System.out.println(getiDNumber());
    System.out.println("Flight date: " + getBoardingDay());
    System.out.println("Time: " + getTime());
    System.out.println("Gate: " + getGate());
    System.out.print("Seat: ");
    seat.show();
    System.out.println("-----------------------------------------------------------------------|");
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " " + iDNumber;
  }
}
