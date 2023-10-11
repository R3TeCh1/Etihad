package etihad;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse EtihadBuildUp dient dazu, verschiedene Objekte zu erstellen und Flüge aufzubauen.
 *
 * @author Kadir Erzurum
 * @version 11.10.2023
 */
public class EtihadBuildUp {
  private Airline theAirline;
  private Pilot theCaptain;
  private Pilot theCoPilot;
  private static Flight inFlight;
  private static Flight outFlight;
  private Passenger theFirstPassenger;
  private Passenger theSecondPassenger;
  private Passenger theFirstPassengerBack;
  private Seat theSeatOne;
  private Seat theSeatTwo;
  private Seat theSeatThree;
  private City inCity;
  private City outCity;
  private Plane thePlane;
  private Airport inAirport;
  private Airport outAirport;
  private LocalDate inDate;
  private LocalDate outDate;
  private BoardingCard inBoardingCardOne;
  private BoardingCard inBoardingCardTwo;
  private BoardingCard outBoardingCardOne;

  /**
   * Die Hauptmethode, die die Erstellung von Objekten und den Aufbau von Flügen koordiniert.
   *
   * @param args Die Eingabeparameter für das Programm (nicht verwendet).
   */
  public static void main(String[] args) {
    EtihadBuildUp build = new EtihadBuildUp();
    build.buildCity();
    build.buildAirport();
    build.buildAirline();
    build.buildPilot();
    build.buildPlane();
    build.buildSeat();
    build.buildPassenger();
    build.buildFlight();
    build.buildBoardingCard();

    System.out.println("------------------------------------------------------------------------");
    inFlight.show();
    System.out.println("------------------------------------------------------------------------");
    outFlight.show();
    System.out.println("------------------------------------------------------------------------");
  }

  /**
   * Erstellt die Städte für den Abflug und die Ankunft.
   */
  private void buildCity() {
    outCity = new City("Abu Dhabi");
    inCity = new City("New York");
  }

  /**
   * Erstellt die Flughäfen für den Abflug und die Ankunft und verknüpft sie mit den Städten.
   */
  private void buildAirport() {
    outAirport = new Airport("Abu Dhabi International Airport", "AUH", outCity);
    inAirport = new Airport("John F. Kennedy International Airport", "JFK", inCity);
    outCity.addInfrastructure(outAirport);
    inCity.addInfrastructure(inAirport);
  }

  /**
   * Erstellt die Fluggesellschaft (Airline).
   */
  private void buildAirline() {
    theAirline = new Airline("Etihad Airways", "EY");
  }

  /**
   * Erstellt die Piloten (Kapitän und Copilot) und fügt sie der Fluggesellschaft hinzu.
   */
  private void buildPilot() {
    theCaptain = new Pilot("Brierley, Mark");
    theCoPilot = new Pilot("Matta, Jihad");
    theAirline.addEmployee(theCaptain);
    theAirline.addEmployee(theCoPilot);
  }

  /**
   * Erstellt das Flugzeug (Plane).
   */
  private void buildPlane() {
    thePlane = new Plane("Boeing 787-9 Dreamliner", "8964BC", "A6-BLL");
  }

  /**
   * Erstellt Sitzplätze (Seats) und fügt sie dem Flugzeug hinzu.
   */
  private void buildSeat() {
    this.theSeatOne = new Seat(3, 'C', this.thePlane);
    this.theSeatTwo = new Seat(3, 'D', this.thePlane);
    this.theSeatThree = new Seat(5, 'D', this.thePlane);
    this.thePlane.addSeat(theSeatOne);
    this.thePlane.addSeat(theSeatTwo);
    this.thePlane.addSeat(theSeatThree);
  }

  /**
   * Erstellt Passagiere (Passengers) und weist ihnen Sitzplätze zu.
   */
  private void buildPassenger() {
    theFirstPassenger = new Passenger("Mustermann, Max", theSeatOne);
    theSecondPassenger = new Passenger("Mustermann, Sarah", theSeatTwo);
    theFirstPassengerBack = new Passenger("Mustermann, Max", theSeatThree);
  }

  /**
   * Erstellt Hin- und Rückflüge mit den entsprechenden Daten.
   */
  private void buildFlight() {
    System.out.println("--------------------------------------------------");
    inDate = LocalDate.of(2023, 2, 5);
    inFlight = new Flight(inDate, "EY103", outAirport, inAirport, theAirline, theCaptain, theCoPilot, thePlane);

    System.out.println("--------------------------------------------------");
    outDate = LocalDate.of(2023, 3, 25);
    outFlight = new Flight(outDate, "EY102", inAirport, outAirport, theAirline, theCaptain, theCoPilot, thePlane);
  }

  /**
   * Diese Methode erstellt die Boarding Karten und weist die Flüge zu.
   */
  private void buildBoardingCard() {
    BigInteger inBoardingCardIDOne = inFlight.generateBoardingCardID();
    BigInteger inBoardingCardIDTwo = inFlight.generateBoardingCardID();
    String inGate = inFlight.generateRandomGate();
    String inTime = inFlight.generateRandomTime();
    BigInteger outBoardingCardIDOne = inFlight.generateBoardingCardID();
    String outGate = inFlight.generateRandomGate();
    String outTime = inFlight.generateRandomTime();
    inBoardingCardOne = new BoardingCard(inBoardingCardIDOne, inGate, inDate, theFirstPassenger, theSeatOne, inTime);
    inBoardingCardTwo = new BoardingCard(inBoardingCardIDTwo, inGate, inDate, theSecondPassenger, theSeatTwo, inTime);
    outBoardingCardOne = new BoardingCard(outBoardingCardIDOne, outGate, outDate, theFirstPassengerBack, theSeatThree, outTime);

    List<BoardingCard> inBoardingCards = new ArrayList<>();
    inBoardingCards.add(inBoardingCardOne);
    inBoardingCards.add(inBoardingCardTwo);
    inFlight.addBoardingCard(inBoardingCards);

    List<BoardingCard> outBoardingCards = new ArrayList<>();
    outBoardingCards.add(outBoardingCardOne);
    outFlight.addBoardingCard(outBoardingCards);
  }
}
