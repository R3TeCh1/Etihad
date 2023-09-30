package etihad;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nazanin
 * @version 30.09.2023
 */

public class Airport {

  private String name;
  private String iataCode;
  private City[] catchmentArea;

  Set<Flight> aSetOfdepartures = new HashSet<Flight>();
  Set<Flight> aSetOfarrivals = new HashSet<Flight>();


//constructor
  public Airport(String name, String iataCode, City[] catchmentArea) {
    this.name = name;
    this.iataCode = iataCode;
    catchmentArea = new City[3];
    catchmentArea[0] = new City("London");
    catchmentArea[1] = new City("Paris");
    catchmentArea[2] = new City("Rome");
    //aSetOfdepartures.add(flights);
    //aSetOfarrivals.add(flights);
  }

  //Methods----------------------------------------------------------------
  public void deice(){


  }
  //Getters----------------------------------------------------------------
  public String getName(){
    return name;
  }

  public String getIataCode(){
    return iataCode;
  }

  public City[] getCatchmentArea(){
    return catchmentArea;
  }


  //Setters----------------------------------------------------------------
  public void setName(String name){
    this.name=name;
  }

  public void setIataCode(String iataCode){
    this.iataCode=iataCode;
  }

  public void setCatchmentArea(City[] catchmentArea) {
    this.catchmentArea = catchmentArea;
  }

  public void setASetOfdepartures(Set<Flight> aSetOfdepartures) {
    this.aSetOfdepartures = aSetOfdepartures;
  }

  public void setASetOfarrivals(Set<Flight> aSetOfarrivals) {
    this.aSetOfarrivals = aSetOfarrivals;
  }


  @Override
  public String toString() {
    return getClass().getSimpleName() + "[name=" + name + ", iataCode=" + iataCode + "]";
  }
}
