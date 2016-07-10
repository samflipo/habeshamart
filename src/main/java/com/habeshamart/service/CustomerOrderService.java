package com.habeshamart.service;

import com.habeshamart.model.CustomerOrder;

/**
 * Created by Sam on 1/25/2016.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
