/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: NewSystemImplementation.java
 * Description: This class implements the CustomerDataViaHttps interface to access customer data via HTTPS.
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.models.Customer;

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
        switch (customerId) {
            case 1:
                return new Customer(customerId, "Newton");
            case 2:
                return new Customer(customerId, "Michael");
            case 3:
                return new Customer(customerId, "Alice");
            default:
                return new Customer(customerId, "Unknown");
        }
    }
}
