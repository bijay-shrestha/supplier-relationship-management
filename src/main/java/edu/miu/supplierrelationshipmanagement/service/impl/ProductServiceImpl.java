package edu.miu.supplierrelationshipmanagement.service.impl;

import edu.miu.supplierrelationshipmanagement.model.Product;
import edu.miu.supplierrelationshipmanagement.repository.ProductRepository;
import edu.miu.supplierrelationshipmanagement.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Collection<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
