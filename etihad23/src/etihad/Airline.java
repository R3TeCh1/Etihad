package etihad;
/**
 * @author
 * @version 30.09.2023
 */
public class Airline {
    private String name;
    private String iataCode;

    //Getter
    public String getName(){
        return name;
    }

    public String getIataCode(){
        return iataCode;

    }

    //Setter
    public void setName(String name){
        this.name=name;

    }
    public void setIataCode(String iataCode){
        this.iataCode=iataCode;
    }
}
