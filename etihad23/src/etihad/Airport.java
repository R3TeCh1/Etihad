package etihad;

/**
 * @author Nazanin
 * @version 30.09.2023
 */

public class Airport {

  private String name;
  private String iataCode;
  private City[] cities;
  private City catchmentArea;
  private Flight[] flights;


//constructor
  public Airport(String name, String iataCode, City[] cities, City catchmentArea, Flight[] flights) {
    this.name = name;
    this.iataCode = iataCode;
    this.cities = cities;
    this.catchmentArea = catchmentArea;
    this.flights = flights;
  }

  //Methods
  public void deice(){


  }
  //getters
  public String getName(){

    return name;

  }

  public String getIataCode(){

    return iataCode;
  }



  //setters

  public void setName(String name){
    this.name=name;
  }
  public void setIataCode(String iataCode){
    this.iataCode=iataCode;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "[name=" + name + ", iataCode=" + iataCode + "]";
  }

}
