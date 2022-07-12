package edu.miu.supplierrelationshipmanagement.controller.restapi;

import edu.miu.supplierrelationshipmanagement.model.Supplier;
import edu.miu.supplierrelationshipmanagement.service.SupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@RestController
@RequestMapping(value = {"/smr/suppliers"})
public class SupplierRestController {

    private final SupplierService supplierService;

    public SupplierRestController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public ResponseEntity<Collection<Supplier>> getAllSuppliers(){
        return ResponseEntity.ok(supplierService.getAllSuppliers());
    }
}
