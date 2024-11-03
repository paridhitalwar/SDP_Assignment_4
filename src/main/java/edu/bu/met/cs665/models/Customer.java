/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: Customer.java
 * Description: This class represents a customer with an ID and a name.
 */
package edu.bu.met.cs665.models;

public class Customer {
    private int id;
    private String name;

    /**
     * Constructor to initialize a customer object.
     *
     * @param id the ID of the customer
     * @param name the name of the customer
     */
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the ID of the customer.
     *
     * @return the ID of the customer
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the customer.
     *
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }
}

