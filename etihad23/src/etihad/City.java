package etihad;
/**
 * @author Nazanin
 * @version 30.09.2023
 */

import java.util.HashSet;
import java.util.Set;


public class City {
  private String name;
  private Airport[] infrastructure;
  private City[] catchmentArea;
  private Set<Airport> airports = new HashSet<>();



//constructor
  public City(String name){
    this.name= name;
    System.out.println("City " + name + " created");
  }

  //getter

  public String getName(){
    return name;
  }

  public Airport[] getInfrastructure() {
    return infrastructure;
  }

  public City[] getCatchmentArea() {
    return catchmentArea;
  }



  //Setter
  public void setName(String name){
    this.name= name;
  }

  public Set<Airport> getAirports() {
    return airports;
  }

  public void setCatchmentArea(City[] catchmentArea) {
    this.catchmentArea = catchmentArea;
  }

  public void setAirports(Set<Airport> airports) {
    this.airports = airports;
  }


  // Setter für Verknüpfung mit Airport
  public void setInfrastructure(Airport[] infrastructure) {
    this.infrastructure = infrastructure;
    System.out.println("City " + name + " is linked to Airport " + infrastructure[0].getName());
  }



  // add methode

  public void addAirport(Airport airport) {
    airports.add(airport);
    System.out.println("Airport " + airport.getName() + " is linked to City " + name);
  }

  // toString
  @Override
  public String toString() {
    return "City " + name;
  }


}
