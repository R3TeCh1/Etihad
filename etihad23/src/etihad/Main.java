package etihad;

import java.time.LocalDate;

public class Main {
  private Flight flight;
  private Pilot captain;
  private Pilot coPilot;
  private Pilot flightEngineer;

  public static void main(String[] args) {
    Main main = new Main();
    main.Build();
  }
  private void Build(){
    LocalDate date = LocalDate.of(2023, 9, 30);
    Airport[] origin = new Airport[4];
    Airport[] destination = new Airport[4];
    Airline organizer = new Airline();
    Passenger[] passengers = new Passenger[853];
    captain = new Pilot("The Captain");
    coPilot = new Pilot("The Co Pilot");
    flightEngineer = new Pilot("The Flight Engineer");
    Pilot[] pilots = new Pilot[]{captain,coPilot,flightEngineer};
    Plane vehicle = new Plane();
    flight = new Flight(date, "LH400", origin, destination, organizer, passengers, captain, coPilot, flightEngineer, vehicle);
  }
}