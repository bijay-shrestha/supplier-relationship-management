package edu.miu.supplierrelationshipmanagement.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(unique = true, nullable = false)
    @NotNull(message = "Product Number cannot be null.")
    private Long productNumber;

    @Column(nullable = false)
    @NotNull(message ="Product Name cannot be null")
    @NotBlank(message ="Product Name cannot be blank")
    private String name;

    private Double unitPrice;
    private Integer quantityInStock;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSupplied;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

}
