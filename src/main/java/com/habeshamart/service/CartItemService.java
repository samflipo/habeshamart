package com.habeshamart.service;

import com.habeshamart.model.Cart;
import com.habeshamart.model.CartItem;

/**
 * Created by Sam on 1/25/2016.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);
}
