package etihad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    List<Passenger> passengers = new ArrayList<>();
    for (int i = 0; i < 853; i++) {
      passengers.add(new Passenger("Passenger " + (i + 1)));
    }

    captain = new Pilot("The Captain");
    coPilot = new Pilot("The Co Pilot");
    flightEngineer = new Pilot("The Flight Engineer");
    Pilot[] pilots = new Pilot[]{captain,coPilot,flightEngineer};
    Plane vehicle = new Plane("Airbus a320", "323432432", 221, "D-3242");
    flight = new Flight(date, "LH400", origin, destination, organizer, passengers, captain, coPilot, flightEngineer, vehicle);

    //Ausgabe
    System.out.println("Flight " + flight.getFlightNum() + " is created with " + passengers.size() + " passengers.");
    flight.cancel();
  }
}