/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataAdapterTest.java
 * Description: This class contains unit tests for the CustomerDataAdapter class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.Customer;
import edu.bu.met.cs665.models.CustomerDataAdapter;
import edu.bu.met.cs665.models.CustomerDataViaHttps;
import edu.bu.met.cs665.models.CustomerDataViaUsb;
import edu.bu.met.cs665.models.NewSystemImplementation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerDataAdapterTest {

    /**
     * Tests the printCustomer method of the adapter.
     */
    @Test
    public void testPrintCustomer() {
        CustomerDataViaHttps newSystem = new NewSystemImplementation();
        CustomerDataViaUsb adapter = new CustomerDataAdapter(newSystem);

        // This should call the printCustomer method of the new system
        adapter.printCustomer(1);
    }

    /**
     * Tests the getCustomerViaUsb method of the adapter.
     */
    @Test
    public void testGetCustomerViaUsb() {
        CustomerDataViaHttps newSystem = new NewSystemImplementation();
        CustomerDataViaUsb adapter = new CustomerDataAdapter(newSystem);

        // This should call the getCustomerViaHttps method of the new system
        Customer customer = adapter.getCustomerViaUsb(1);

        assertNotNull(customer);
        assertEquals(1, customer.getId());
        assertEquals("Newton", customer.getName());
    }

    /**
     * Tests the adapter with a different customer ID.
     */
    @Test
    public void testGetCustomerViaUsbWithDifferentId() {
        CustomerDataViaHttps newSystem = new NewSystemImplementation();
        CustomerDataViaUsb adapter = new CustomerDataAdapter(newSystem);

        // This should call the getCustomerViaHttps method of the new system with a different ID
        Customer customer = adapter.getCustomerViaUsb(2);

        assertNotNull(customer);
        assertEquals(2, customer.getId());
        assertEquals("Michael", customer.getName());
    }

    /**
     * Tests the adapter with an unknown customer ID.
     */
    @Test
    public void testGetCustomerViaUsbWithUnknownId() {
        CustomerDataViaHttps newSystem = new NewSystemImplementation();
        CustomerDataViaUsb adapter = new CustomerDataAdapter(newSystem);

        // This should call the getCustomerViaHttps method of the new system with an unknown ID
        Customer customer = adapter.getCustomerViaUsb(3);

        assertNotNull(customer);
        assertEquals(3, customer.getId());
        assertEquals("Alice", customer.getName());
    }
}