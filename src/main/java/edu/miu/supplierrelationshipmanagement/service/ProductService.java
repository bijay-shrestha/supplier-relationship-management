package edu.miu.supplierrelationshipmanagement.service;

import edu.miu.supplierrelationshipmanagement.model.Product;

import java.util.Collection;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
public interface ProductService {
    Collection<Product> getAllProducts();

    void addProduct(Product product);
}
