package com.habeshamart.dao;

import java.util.List;

import com.habeshamart.model.Customer;

/**
 * Created by Sam on 1/25/2016.
 */
public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
