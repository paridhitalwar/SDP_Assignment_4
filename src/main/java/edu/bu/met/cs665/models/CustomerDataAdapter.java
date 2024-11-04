/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataAdapter.java
 * Description: This class adapts CustomerDataViaHttps to be used as CustomerDataViaUsb.
 */

package edu.bu.met.cs665.models;

import edu.bu.met.cs665.models.Customer;

public class CustomerDataAdapter implements CustomerDataViaUsb {
    private CustomerDataViaHttps newSystem;

    /**
     * Constructor to initialize the adapter with the new system implementation.
     *
     * @param newSystem the new system implementation
     */
    public CustomerDataAdapter(CustomerDataViaHttps newSystem) {
        this.newSystem = newSystem;
    }

    @Override
    public void printCustomer(int customerId) {
        newSystem.printCustomer(customerId);
    }

    /**
     * Retrieves customer information via USB based on customer ID.
     *
     * @param customerId the ID of the customer to retrieve
     * @return the customer object
     */
    @Override
    public Customer getCustomerViaUsb(int customerId) {
        return newSystem.getCustomerViaHttps(customerId);
    }
}
