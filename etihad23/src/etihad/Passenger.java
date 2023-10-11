package etihad;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Passenger repräsentiert einen Passagier mit Eigenschaften wie Name, Sitzplatz und
 * zugehörigen Boarding-Karten.
 *
 * @author Alex
 * @version 11.10.2023
 */
public class Passenger {
  private String name;
  private Seat seat;
  private List<BoardingCard> boardingCards = new ArrayList<>();

  /**
   * Konstruktor für die Passenger-Klasse.
   *
   * @param name Der Name des Passagiers.
   * @param seat Der zugehörige Sitzplatz des Passagiers.
   */
  public Passenger(String name, Seat seat){
    this.name = name;
    this.seat = seat;
  }

  /**
   * Getter Methoden
   */
  public String getName(){
    return name;
  }

  public Seat getSeat() {
    return seat;
  }

  public List<BoardingCard> getBoardingCards() {
    return boardingCards;
  }

  /**
   * Setter Methoden
   */
  public void setName(String name){
    this.name = name;
  }

  public void setSeat(Seat seat){
    this.seat = seat;
  }

  public void setBoardingCards(List<BoardingCard> boardingCards) {
    this.boardingCards = boardingCards;
  }

  /**
   * Fügt dem Passagier eine Boarding-Karte hinzu, um die Zuordnung zwischen Passagier und Flug
   * herzustellen.
   *
   * @param boardingCard Die hinzuzufügende Boarding-Karte.
   */
  public void addBoardingCard(BoardingCard boardingCard) {
    boardingCards.add(boardingCard);
  }

  /**
   * Zeigt Informationen zum Passagier, einschließlich des Namens.
   */
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
