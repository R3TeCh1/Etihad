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
    outCity = new City("Berlin");
    inCity = new City("New York");
  }

  private void buildAirport() {
    outAirport = new Airport("Berlin Brandenburg Airport", "BER", outCity);
    inAirport = new Airport("Joh F. Kennedy International Airport", "JFK", inCity);
    outCity.addInfrastructure(outAirport);
    inCity.addInfrastructure(inAirport);
  }

  private void buildAirline() {
  }

  private void buildPilot() {

  }

  private void buildPlane() {
  }

  private void buildSeat() {
  }

  private void buildPassenger() {
  }





  private void buildFlight() {
  }
}
