package com.habeshamart.service.impl;

import com.habeshamart.dao.CartItemDao;
import com.habeshamart.model.Cart;
import com.habeshamart.model.CartItem;
import com.habeshamart.service.CartItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sam on 1/25/2016.
 */

@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId (int productId) {
        return cartItemDao.getCartItemByProductId(productId);
    }
}
