package edu.miu.supplierrelationshipmanagement.repository;

import edu.miu.supplierrelationshipmanagement.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
