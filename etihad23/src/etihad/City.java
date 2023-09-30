package etihad;
/**
 * @author Nazanin
 * @version 30.09.2023
 */
public class City {
  private String name;
  private Airport infrastructure;

//constructor
  public City(String name, Airport infrastructure){
    this.name= name;
    this.infrastructure= infrastructure;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name= name;
  }

}
