package etihad;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kadir
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

  //TOSTRING--------------------------------------------------------
  @Override
  public String toString(){
    return getClass().getSimpleName() + " " + name;
  }
}
