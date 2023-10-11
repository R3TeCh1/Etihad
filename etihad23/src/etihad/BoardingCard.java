package etihad;

import java.math.BigInteger;
import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author Kadir Erzurum
 * @version 01.10.2023
 */
public class BoardingCard {
  private BigInteger iDNumber;
  private String gate;
  private LocalDate boardingDay;
  private Passenger passenger;
  private Flight flight;
  private Seat seat;
  private String time;

  public BoardingCard(BigInteger iDNumber, String gate, LocalDate boardingDay, Passenger passenger, Flight flight, Seat seat, String time) {
    this.iDNumber = iDNumber;
    this.gate = gate;
    this.boardingDay = boardingDay;
    this.passenger = passenger;
    this.flight = flight;
    this.seat = seat;
    this.time = time;

    System.out.println(toString() + " created");
  }

  //GETTER
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

  //SETTER
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
