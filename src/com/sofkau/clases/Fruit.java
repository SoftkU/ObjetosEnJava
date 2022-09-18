/**
 * Represents a fruit entity with 3 attributes:
 * 1 - Name
 * 2 - Average weight
 * 3 - Colors
 * @author Duhan Enrique Renteria Hernandez
 */

package com.sofkau.clases;

import java.util.ArrayList;

public class Fruit {

    // PROPERTIES OR ATTRIBUTES
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    // CONSTRUCTORS

    // Void constructor
    /**
     * Create an instance with no attributes of the Fruit class
     */
    public Fruit()
    {
        super();
    }

    // Constructor with properties or attributes
    /**
     * Create an instance with attributes of the Fruit class
     * @param name Name of the fruit.
     * @param averageWeight Average weight of the fruit.
     * @param colors List of colors associated with the fruit.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    // METHODS
    /**
     * Method getter name
     * @return Get the name attribute of the fruit
     */
    public String getName(){
        return this.name;
    }

    /**
     * Method setter name
     * @param name Set the name attribute of the fruit.
     */
    public void setName (String name)
        {
            this.name=name;
        }

    /**
     * Method getter average weight
     * @return Get the average weight attribute of the fruit
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Method setter average weight
     * @param averageWeight Set the average weight attribute of the fruit.
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Method getter colors
     * @return Get the list of colors associated with the fruit.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Method setter colors
     * @param colors Set the list of colors associated with the fruit.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     *
     * @return It shows on the screen the attributes that an instance of Fruit contains.
     */
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }
}
