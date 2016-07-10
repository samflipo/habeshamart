package com.habeshamart.service;

import com.habeshamart.model.Cart;

/**
 * Created by Sam on 1/25/2016.
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
