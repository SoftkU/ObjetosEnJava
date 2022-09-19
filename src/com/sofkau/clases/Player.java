/**
 * Represents a person entity with 5 attributes:
 * 1 - Name
 * 2 - Last Name One
 * 3 - Last Name Two
 * 4 - Date birth
 * 5 - Height
 * @author Duhan Enrique Renteria Hernandez
 */

package com.sofkau.clases;

import java.util.Date;

public class Player extends Person {

    // PROPERTIES OR ATTRIBUTES
    private String clubName;
    private String position;
    private int jerseyNumber;
    private float salary;

    // CONSTRUCTORS
    // Constructor with properties or attributes
    /**
     * Create an instance with attributes of the Player class extends of person
     * @param name Name of the person.
     * @param lastName1 Last name one of the person.
     * @param lastName2 Last name two of the person.
     * @param dateBirth Date birth of the person.
     * @param height Height of the person.
     * @param clubName Name of the club where the person plays.
     * @param position Position where the person plays.
     * @param jerseyNumber Jersey number with which the person plays.
     * @param salary Salary earned by the player.
     */
    public Player(String name, String lastName1, String lastName2, Date dateBirth, float height, String clubName, String position, int jerseyNumber, float salary) {
        super(name, lastName1, lastName2, dateBirth, height);
        this.clubName = clubName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.salary = salary;
    }

    // METHODS

    /**
     * Method getter club name
     * @return Get the club name attribute of the player.
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * Method setter club name
     * @param clubName Set the club name attribute of the player.
     */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    /**
     * Method getter position
     * @return Get the position attribute of the player.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Method setter position
     * @param position Set the club name attribute of the player.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Method getter jersey number
     * @return Get the position attribute of the player.
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * Method setter jersey number
     * @param jerseyNumber Set the jersey number attribute of the player.
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * Method getter salary
     * @return Get the salary attribute of the player.
     */
    public float getSalary() {
        return salary;
    }

    /**
     * Method setter salary
     * @param salary Set the salary attribute of the player.
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     *
     * @return It shows on the screen the attributes that an instance of Player contains.
     */
    @Override
    public String toString() {
        return "Player{" +
                " name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                ", clubName='" + clubName + '\'' +
                ", position='" + position + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", salary=" + salary +
                '}';
    }
}
