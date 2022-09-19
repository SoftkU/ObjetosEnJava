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

public class Animal {

    // PROPERTIES OR ATTRIBUTES
    protected String code;
    private String breed;
    private String name;
    private int age;

    // CONSTRUCTORS

    // Void constructor
    /**
     * Create an instance with no attributes of the Person class
     */
    public Animal() {
        super();
    }

    // Constructor with properties or attributes
    /**
     * Create an instance with attributes of the Animal class
     * @param breed Breed of the animal.
     * @param name Name of the animal.
     * @param age Age of the animal.
     */

    public Animal(String breed, String name, int age) {
        this.code=setCode();
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    // METHODS

    /**
     * Method getter code
     * @return Get the code of the animal.
     */
    public String getCode() {
        return code;
    }

    /**
     * Method setter code
     * @return Assign an identifier of the animal.
     */
    private String setCode() {
        UUID uuid = UUID.randomUUID();
        return "" + uuid;
    }

    /**
     * Method getter breed
     * @return Get the bread of the animal.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Method setter breed
     * @param breed Set the breed of the animal.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Method getter name
     * @return Get the name of the animal.
     */
    public String getName() {
        return name;
    }

    /**
     * Method setter name
     * @param name Set the name of the animal.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method getter age
     * @return Get the age of the animal.
     */
    public int getAge() {
        return age;
    }

    /**
     * Method setter age
     * @param age Set the age of the animal.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return It shows on the screen the attributes that an instance of Animal contains.
     */
    @Override
    public String toString() {
        return "Animal{" +
                "code='" + code + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
