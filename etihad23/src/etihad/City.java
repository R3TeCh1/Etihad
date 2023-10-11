package etihad;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Nazanin
 * @version 11.10.2023
 */

public class City {
  private String name;
  private Set<Airport> infrastructure = new HashSet<>();

  //constructor
  public City(String name){
    this.name= name;
    System.out.println(toString() + " created");
  }

  //Getter
  public String getName(){
    return name;
  }

  public Set<Airport> getInfrastructure() {
    return infrastructure;
  }

  public void addInfrastructure(Airport infrastructure) {
    this.infrastructure.add(infrastructure);
  }

  //Setter
  public void setName(String name){
    this.name= name;
  }

  // Setter für Verknüpfung mit Airport
  public void setInfrastructure(Set<Airport> infrastructure) {
    this.infrastructure = infrastructure;
    Iterator<Airport> iterator = infrastructure.iterator();
    if (iterator.hasNext()) {
      Airport firstAirport = iterator.next();
      System.out.println("City " + name + " is linked to Airport " + firstAirport.getName());
    }
  }

  // add methode
  public void addAirport(Airport airport) {
    infrastructure.add(airport);
    System.out.println("Airport " + airport.getName() + " is linked to City " + name);
  }
//show methode
  public void show(){
    System.out.println(" near " + this.name);
  }
  // toString
  @Override
  public String toString() {
    return getClass().getSimpleName() + " City: " + name;
  }
}
