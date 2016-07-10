package com.habeshamart.dao;

import java.util.List;

import com.habeshamart.model.Product;

/**
 * Created by Sam on 1/6/2016.
 */
public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
