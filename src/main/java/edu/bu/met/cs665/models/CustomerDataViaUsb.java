/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataViaUsb.java
 * Description: This interface defines methods for accessing customer data via USB.
 */

package edu.bu.met.cs665.models;

public interface CustomerDataViaUsb {
    void printCustomer(int customerId);
    /**
     * Retrieves customer information via USB based on customer ID.
     *
     * @param customerId the ID of the customer to retrieve
     * @return the customer object
     */
    Customer getCustomerViaUsb(int customerId);
}

