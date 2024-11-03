/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: NewSystemImplementation.java
 * Description: This class implements the CustomerDataViaHttps interface to provide HTTPS data access.
 */
package edu.bu.met.cs665.models;

public class NewSystemImplementation implements CustomerDataViaHttps {
    @Override
    public void printCustomer(int customerId) {
        // Mock implementation
        System.out.println("Customer data retrieved via HTTPS for customer ID: " + customerId);
    }

    /**
     * Retrieves customer information via HTTPS based on customer ID.
     *
     * @param customerId the ID of the customer to retrieve
     * @return the customer object
     */
    @Override
    public Customer getCustomerViaHttps(int customerId) {
        // Mock implementation
        return new Customer(customerId, "Michael");
    }
}

