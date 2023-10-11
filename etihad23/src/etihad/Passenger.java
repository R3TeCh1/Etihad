package etihad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Alex
 * @version 30.09.2023
 */
public class Passenger {
  private String name;
  private Seat seat;
  private Set<Flight> flights = new HashSet<>();
  private List<BoardingCard> boardingCards = new ArrayList<>();

  public void addFlight(Flight f) {
    flights.add(f);
  }

  public void addBoardingCard(BoardingCard boardingCard) {
    boardingCards.add(boardingCard);
  }

  //Konstruktor--------------------------------------------------------
  public Passenger(String name, Seat seat){
    this.name = name;
    this.seat = seat;
  }

  //Getter--------------------------------------------------------
  public String getName(){
    return name;
  }

  public Seat getSeat() {
    return seat;
  }

  public Set<Flight> getFlights() {
    return flights;
  }

  public List<BoardingCard> getBoardingCards() {
    return boardingCards;
  }

  //Setter--------------------------------------------------------
  public void setName(String name){
    this.name = name;
  }

  public void setSeat(Seat seat){
    this.seat = seat;
  }

  public void setFlights(Set<Flight> flights){
    this.flights = flights;
  }

  public void setBoardingCards(List<BoardingCard> boardingCards) {
    this.boardingCards = boardingCards;
  }

  //SHOW--------------------------------------------------------
  public void show(){
    System.out.print("" + this.name);
    System.out.println();
  }

  //TOSTRING--------------------------------------------------------
  @Override
  public String toString(){
    return getClass().getSimpleName() + " " + name + " | " + seat.toString();
  }
}
