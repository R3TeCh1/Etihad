package etihad;

import java.awt.event.WindowFocusListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EtihadBuildUp {

  private Airline theAirline;
  private Pilot theCaptain;
  private Pilot theCoPilot;
  private static Flight inFlight;
  private static Flight outFlight;
  private Passenger theFirstPassenger;
  private Passenger theSecondPassenger;
  private Seat theSeatOne;
  private Seat theSeatTwo;
  private City inCity;
  private City outCity;
  private Plane thePlane;
  private Airport inAirport;
  private Airport outAirport;
  private LocalDate inDate;
  private LocalDate outDate;

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
    System.out.println("--------------------------------");
    inFlight.show();
    System.out.println("--------------------------------");
    outFlight.show();
    System.out.println("--------------------------------");
  }

  private void buildCity() {
    outCity = new City("Abu Dhabi");
    inCity = new City("New York");
  }

  private void buildAirport() {
    outAirport = new Airport("Abu Dhabi International Airport", "AUH", outCity);
    inAirport = new Airport("John F. Kennedy International Airport", "JFK", inCity);
    outCity.addInfrastructure(outAirport);
    inCity.addInfrastructure(inAirport);
  }

  private void buildAirline() {
    theAirline = new Airline("Etihad Airways", "EY");
  }

  private void buildPilot() {
    theCaptain = new Pilot("Brierley, Mark");
    theCoPilot = new Pilot("Matta, Jihad");
    theAirline.addEmployee(theCaptain);
    theAirline.addEmployee(theCoPilot);
  }

  private void buildPlane() {
    thePlane = new Plane("Boeing 787-9 Dreamliner", "8964BC", "A6-BLL");
  }

  private void buildSeat() {
    this.theSeatOne = new Seat(3, 'C', this.thePlane);
    this.theSeatTwo = new Seat(3, 'D', this.thePlane);
    this.thePlane.addSeat(theSeatOne);
    this.thePlane.addSeat(theSeatTwo);
  }

  private void buildPassenger() {
    theFirstPassenger = new Passenger("Max Mustermann");
    theSecondPassenger = new Passenger("Sarah Mustermann");
  }

  private void buildFlight() {
    System.out.println("--------------------------------");
    inDate = LocalDate.of(2023, 2, 5);
    List<Passenger> inPassengers = new ArrayList<>();
    inPassengers.add(theFirstPassenger);
    inPassengers.add(theSecondPassenger);
    inFlight = new Flight(inDate, "1000", outAirport, inAirport, theAirline, inPassengers, theCaptain, theCoPilot, thePlane);
    System.out.println("--------------------------------");
    outDate = LocalDate.of(2023, 3, 25);
    List<Passenger> outPassengers = new ArrayList<>();
    outPassengers.add(theFirstPassenger);
    outFlight = new Flight(outDate, "2000", inAirport, outAirport, theAirline, outPassengers, theCaptain, theCoPilot, thePlane);
  }
}
