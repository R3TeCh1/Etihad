package etihad;

public class EtihadBuildUp {

  private Airline theAirline;
  private Pilot theCaptain;
  private Pilot theCoPilot;
  private Flight inFlight;
  private Flight outFlight;
  private Passenger theFirstPassenger;
  private Passenger theSecondPassenger;
  private Seat theSeatOne;
  private Seat theSeatTwo;
  private City inCity;
  private City outCity;
  private Plane thePlane;
  private Airport inAirport;
  private Airport outAirport;

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
  }

  private void buildCity() {
    outCity = new City("Abu Dhabi");
    inCity = new City("New York");
  }

  private void buildAirport() {
    outAirport = new Airport("Abu Dhabi International Airport", "AUH", outCity);
    inAirport = new Airport("Joh F. Kennedy International Airport", "JFK", inCity);
    outCity.addInfrastructure(outAirport);
    inCity.addInfrastructure(inAirport);
  }

  private void buildAirline() {
    theAirline = new Airline("Etihad Airways", "EY");
  }

  private void buildPilot() {
    theCaptain = new Pilot("Mark Brierley");
    theCoPilot = new Pilot("Jihad Matta");
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
  }

  private void buildFlight() {
  }
}
