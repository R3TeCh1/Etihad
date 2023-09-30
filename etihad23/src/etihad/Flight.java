package etihad;

import java.util.Date;

/**
 * @author Kadir
 * @version 30.09.2023
 */
public class Flight {

  //DEKLARATION----------------------------------------------------------------

  //-date
  private Date departure;
  private Date arrival;
  //-flightNum
  private String flightNum;


  //METHODEN----------------------------------------------------------------

  //+refuel
  public void refuel(){

  }
  //+takeOff
  public void takeOff(){

  }
  //+land
  public void land(){

  }
  //+delay
  public void delay(){

  }
  //+cancel
  public void cancel(){

  }


  //GETTER----------------------------------------------------------------

  public Date getDeparture(){
    return departure;
  }

  public Date getArrival(){
    return arrival;
  }

  public String getFlightNum(){
    return flightNum;
  }


  //SETTER----------------------------------------------------------------

  public void setDeparture(Date departure){
    this.departure = departure;
  }

  public void setArrival(Date arrival){
    this.arrival = arrival;
  }

  public void setFlightNum(String flightNum){
    this.flightNum = flightNum;
  }
}
