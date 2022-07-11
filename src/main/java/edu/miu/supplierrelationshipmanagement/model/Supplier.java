package edu.miu.supplierrelationshipmanagement.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Supplier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId;

    @Column(unique = true)
    @NotNull(message = "Supplier Number cannot be null.")
    private Integer supplierNumber;
    @NotNull(message ="Supplier Name cannot be null")
    @NotBlank(message ="Supplier Name cannot be blank")
    private String name;
    private String contactPhoneNumber;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "supplier")
    private Collection<Product> products = new ArrayList<>();
}
