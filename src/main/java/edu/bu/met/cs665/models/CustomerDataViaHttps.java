/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataViaHttps.java
 * Description: This interface defines methods for accessing customer data via HTTPS.
 */
package edu.bu.met.cs665.models;

public interface CustomerDataViaHttps {
    void printCustomer(int customerId);
    /**
     * Retrieves customer information via HTTPS based on customer ID.
     *
     * @param customerId the ID of the customer to retrieve
     * @return the customer object
     */
    Customer getCustomerViaHttps(int customerId);
}

