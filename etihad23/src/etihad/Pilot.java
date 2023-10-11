package etihad;

import java.util.HashSet;
import java.util.Set;

/**
 * Die Klasse Pilot repräsentiert einen Piloten mit Namen, einer zugehörigen Fluggesellschaft und einer Liste von Flugaufgaben.
 * Ein Pilot kann von einer Fluggesellschaft eingestellt und entlassen werden sowie für Flüge gebucht werden.
 *
 * @author Kadir Erzurum
 * @version 11.10.2023
 */
public class Pilot {
  //Deklarieren--------------------------------------------------------

  private String name;
  private Airline employer;
  private Set<Flight> tasks = new HashSet<>();

  //Konstruktror--------------------------------------------------------

  /**
   * Konstruktor für die Pilotenklasse.
   *
   * @param name Der Name des Piloten.
   */
  public Pilot(String name){
    this.name = name;
    System.out.println(toString() + " created");
  }

  //Methoden--------------------------------------------------------

  /**
   * Stellt den Piloten bei einer Fluggesellschaft ein.
   *
   * @param airline Die Fluggesellschaft, bei der der Pilot eingestellt wird.
   */
  public void hire(Airline airline){
    this.employer = airline;
    System.out.println(toString() + " wurde von " + airline.getName() + " eingestellt.");
  }

  /**
   * Entlässt den Piloten von seiner aktuellen Fluggesellschaft.
   */
  public void fire(){
    this.employer = null;
    System.out.println(toString() + " wurde entlassen");
  }

  /**
   * Bucht den Piloten für einen Flug.
   *
   * @param flight Der Flug, für den der Pilot gebucht wird.
   */
  public void book(Flight flight){
    tasks.add(flight);
    System.out.println(toString() + "wurde für den Flug " + flight.getFlightNum() + " gebucht.");
  }

  //Getter--------------------------------------------------------

  /**
   * Gibt den Namen des Piloten zurück.
   *
   * @return Der Name des Piloten.
   */
  public String getName(){
    return name;
  }

  /**
   * Gibt die zugehörige Fluggesellschaft des Piloten zurück.
   *
   * @return Die zugehörige Fluggesellschaft des Piloten.
   */
  public Airline getEmployer(){
    return employer;
  }

  /**
   * Gibt die Liste der Flugaufgaben des Piloten zurück.
   *
   * @return Die Liste der Flugaufgaben des Piloten.
   */
  public Set<Flight> getTasks(){
    return tasks;
  }

  //Setter--------------------------------------------------------

  /**
   * Setzt den Namen des Piloten.
   *
   * @param name Der neue Name des Piloten.
   */
  public void setName(String name){
    this.name = name;
  }

  /**
   * Setzt die zugehörige Fluggesellschaft des Piloten.
   *
   * @param employer Die zugehörige Fluggesellschaft des Piloten.
   */
  public void setAirline(Airline employer){
    this.employer = employer;
  }

  /**
   * Setzt die Liste der Flugaufgaben des Piloten.
   *
   * @param tasks Die Liste der Flugaufgaben des Piloten.
   */
  public void setTasks(Set<Flight> tasks) {
    this.tasks = tasks;
  }

  public void show(boolean isCaptain) {
    String c = isCaptain ? "Captain " : "CoPilot ";
    System.out.print(c + this.name);
  }

  //TOSTRING--------------------------------------------------------

  /**
   * Gibt eine Zeichenfolge zurück, die den Klassennamen und den Namen des Piloten darstellt.
   *
   * @return Eine Zeichenfolge im Format "Klassenname Name des Piloten".
   */
  @Override
  public String toString(){
    return getClass().getSimpleName() + " " + name;
  }
}
