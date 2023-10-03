package etihad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleksandr Cherniaiev
 * @version 30.09.2023
 */
public class Airline {
    private String name;
    private String iataCode;
    private List<Pilot> employee;
    private List<Flight> flights;

    //KONSTRUKTOR-----------------------------------------------------
    /**
     * Konstruktor für eine Fluggesellschaft mit Namen und IATA-Code.
     *
     * @param name     Der Name der Fluggesellschaft.
     * @param iataCode Der IATA-Code der Fluggesellschaft.
     */
    public Airline(String name, String iataCode) {
        this.name = name;
        this.iataCode = iataCode;
        employee = new ArrayList<Pilot>();
        flights = new ArrayList<Flight>();
        System.out.println(toString() + " created");
    }

    // Standardkonstruktor
    /**
     * Standardkonstruktor für eine Fluggesellschaft.
     */
    public Airline() {
        employee = new ArrayList<Pilot>();
        flights = new ArrayList<Flight>();
        System.out.println(toString() + " created");
    }

    //GETTER-----------------------------------------------------------------
    /**
     * Gibt die Liste der Mitarbeiter (Piloten) der Fluggesellschaft zurück.
     *
     * @return Die Liste der Mitarbeiter (Piloten).
     */
    public List<Pilot> getEmployee() {
        return employee;
    }

    /**
     * Gibt die Liste der Flüge der Fluggesellschaft zurück.
     *
     * @return Die Liste der Flüge.
     */
    public List<Flight> getFlights() {
        return flights;
    }

    /**
     * Getter für den Namen der Fluggesellschaft.
     *
     * @return Der Name der Fluggesellschaft.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter für den IATA-Code der Fluggesellschaft.
     *
     * @return Der IATA-Code der Fluggesellschaft.
     */
    public String getIataCode() {
        return iataCode;
    }

    //SETTER-----------------------------------------------------------------
    /**
     * Legt die Liste der Mitarbeiter (Piloten) der Fluggesellschaft fest.
     *
     * @param employee Die Liste der Mitarbeiter (Piloten) festlegen.
     */
    public void setEmployee(List<Pilot> employee) {
        this.employee = employee;
    }

    /**
     * Legt die Liste der Flüge der Fluggesellschaft fest.
     *
     * @param flights Die Liste der Flüge festlegen.
     */
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * Setter für den Namen der Fluggesellschaft.
     *
     * @param name Der Name der Fluggesellschaft festlegen.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter für den IATA-Code der Fluggesellschaft.
     *
     * @param iataCode Der IATA-Code der Fluggesellschaft festlegen.
     */
    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    //WEITERE METHODEN-----------------------------------------------------
    /**
     * Fügt einen Flug zur Liste der Flüge der Fluggesellschaft hinzu.
     *
     * @param f Der hinzuzufügende Flug.
     */
    public void addFlight(Flight f) {
        flights.add(f);
    }

    /**
     * Entfernt einen Flug aus der Liste der Flüge der Fluggesellschaft.
     *
     * @param f Der zu entfernende Flug.
     */
    public void removeFlight(Flight f) {
        flights.remove(f);
    }

    /**
     * Fügt einen Mitarbeiter (Pilot) zur Liste der Mitarbeiter der Fluggesellschaft hinzu.
     *
     * @param p Der hinzuzufügende Mitarbeiter (Pilot).
     */
    public void addEmployee(Pilot p) {
        employee.add(p);
    }

    /**
     * Entfernt einen Mitarbeiter (Pilot) aus der Liste der Mitarbeiter der Fluggesellschaft.
     *
     * @param p Der zu entfernende Mitarbeiter (Pilot).
     */
    public void removeEmployee(Pilot p) {
        employee.remove(p);
    }

    //TOSTRING-----------------------------------------------------
    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " +
                "name='" + name + '\'' +
                ", iataCode='" + iataCode;
    }
}
