/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: Main.java
 * Description: This class demonstrates the usage of the adapter pattern to integrate the legacy system interface with the new system implementation.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.*;

/**
 * This is the Main class.
 */
public class Main {
  public static void main(String[] args) {
    /**
     * Create an instance of the new system implementation
      */
    CustomerDataViaHttps newSystem = new NewSystemImplementation();

    /**
     * Create an adapter instance that wraps the new system
     */
    CustomerDataViaUsb adapter = new CustomerDataAdapter(newSystem);

    /**
     * Use the adapter to print customer data
     */
    adapter.printCustomer(1);

    /**
     * Use the adapter to get customer data
     */
    Customer customer = adapter.getCustomerViaUsb(1);
    System.out.println("Customer ID: " + customer.getId());
    System.out.println("Customer Name: " + customer.getName());
  }
}

