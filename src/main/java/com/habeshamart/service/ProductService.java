package com.habeshamart.service;

import java.util.List;

import com.habeshamart.model.Product;

/**
 * Created by Sam on 1/24/2016.
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
