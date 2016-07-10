package com.habeshamart.dao;

import java.io.IOException;

import com.habeshamart.model.Cart;

/**
 * Created by Sam on 1/11/2016.
 */
public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
