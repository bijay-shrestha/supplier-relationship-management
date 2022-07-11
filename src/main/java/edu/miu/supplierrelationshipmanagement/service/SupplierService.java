package edu.miu.supplierrelationshipmanagement.service;

import edu.miu.supplierrelationshipmanagement.model.Supplier;

import java.util.Collection;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
public interface SupplierService {
    Collection<Supplier> getAllSuppliers();

    void addSupplier(Supplier supplier);
}
