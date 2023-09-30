package etihad;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kadir Erzurum
 * @version 30.09.2023
 */
public class Pilot {
  //Deklarieren--------------------------------------------------------
  private String name;
  private Airline employer;
  private Set<Flight> tasks = new HashSet<Flight>();

  //Konstruktror--------------------------------------------------------
  public Pilot(String name){
    this.name = name;
  }

  //Methoden--------------------------------------------------------
  public void hire(Airline airline){
    this.employer = airline;
    System.out.println(name + " wurde von " + airline.getName() + " eingestellt.");
  }

  public void fire(){
    this.employer = null;
    System.out.println("Pilot wurde entlassen");
  }

  public void book(Flight flight){
    tasks.add(flight);
    System.out.println(name + "wurde für den Flug " + flight.getFlightNum() + " gebucht.");
  }

  //Getter--------------------------------------------------------
  public String getName(){
    return name;
  }

  public Airline getEmployer(){
    return employer;
  }

  public Set<Flight> getTasks(){
    return tasks;
  }

  //Setter--------------------------------------------------------
  public void setName(String name){
    this.name = name;
  }

  public void setAirline(Airline employer){
    this.employer = employer;
  }

  public void setTasks(Set<Flight> tasks) {
    this.tasks = tasks;
  }

  //TOSTRING--------------------------------------------------------
  @Override
  public String toString(){
    return getClass().getSimpleName() + " " + name;
  }
}
