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

public class Person {

    // PROPERTIES OR ATTRIBUTES
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    // CONSTRUCTORS

    // Void constructor
    /**
     * Create an instance with no attributes of the Person class
     */
    public Person() {
        super();
    }

    // Constructor with properties or attributes
    /**
     * Create an instance with attributes of the Person class
     * @param name Name of the person.
     * @param lastName1 Last name one of the person.
     * @param lastName2 Last name two of the person.
     * @param dateBirth Date birth of the person.
     * @param height Height of the person.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    // METHODS

    /**
     * Method getter name
     * @return Get the name attribute of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Method setter name
     * @param name Set the name attribute of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method getter first last name
     * @return Get the first last name attribute of the person.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Method setter first last name
     * @param lastName1 Set the first last name attribute of the person.
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Method getter second last name
     * @return Get the second last name attribute of the person.
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Method setter second last name
     * @param lastName2 Set the second last name attribute of the person.
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Method getter date birth
     * @return Get the date birth attribute of the person.
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Method setter date birth
     * @param dateBirth Set the date birth attribute of the person.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Method getter height
     * @return Get the height attribute of the person.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Method setter height
     * @param height Set the height attribute of the person.
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *
     * @return It shows on the screen the attributes that an instance of Person contains.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                '}';
    }
}
