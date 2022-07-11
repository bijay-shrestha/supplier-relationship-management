package edu.miu.supplierrelationshipmanagement.service.impl;

import edu.miu.supplierrelationshipmanagement.model.Supplier;
import edu.miu.supplierrelationshipmanagement.repository.SupplierRepository;
import edu.miu.supplierrelationshipmanagement.service.SupplierService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Collection<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public void addSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }
}
