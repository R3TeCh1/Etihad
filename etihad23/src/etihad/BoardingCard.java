package etihad;

import java.math.BigInteger;
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

  public BoardingCard(BigInteger iDNumber, String gate, LocalDate boardingDay, Passenger passenger, Flight flight, Seat seat) {
    this.iDNumber = iDNumber;
    this.gate = gate;
    this.boardingDay = boardingDay;
    this.passenger = passenger;
    this.flight = flight;
    this.seat = seat;
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

  @Override
  public String toString() {
    return getClass().getSimpleName() + " " + iDNumber;
  }
}
