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

import java.util.UUID;

public class Product {

    // PROPERTIES OR ATTRIBUTES
    protected String id;
    private String name;
    private String description;
    private float price;
    private boolean state;

    // CONSTRUCTORS

    // Void constructor
    /**
     * Create an instance with no attributes of the Person class
     */
    public Product() {
        super();
    }

    // Constructor with properties or attributes
    /**
     * Create an instance with attributes of the Product class
     * @param name Name of the product.
     * @param description Description of the product.
     * @param price Price of the product.
     * @param state Activation status of the product.
     */
    public Product(String name, String description, float price, boolean state) {
        this.id=setId();
        this.name = name;
        this.description = description;
        this.price = price;
        this.state = state;
    }

    // METHODS

    /**
     * Method getter id
     * @return Get the id of the product.
     */
    public String getId() {
        return id;
    }

    /**
     * Method setter id
     * @return Assign an identifier of the product.
     */
    private String setId() {
       UUID uuid = UUID.randomUUID();
        return "" + uuid;
    }

    /**
     * Method getter name
     * @return Get the name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Method setter name
     * @param name Set the name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method getter description
     * @return Get the description of the product.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Method setter description
     * @param description Set the description of the product.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method getter price
     * @return Get the price of the product.
     */
    public float getPrice() {
        return price;
    }

    /**
     * Method setter price
     * @param price Set the price of the product.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Method getter state
     * @return Get the state of the product.
     */
    public boolean getState() {
        return state;
    }

    /**
     * Method setter state
     * @param state Set the state of the product.
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     *
     * @return It shows on the screen the attributes that an instance of Product contains.
     */
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}
