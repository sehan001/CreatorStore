package org.creatorstore.creatorstore.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "product name is required")
    @Column(nullable = false)
    private String name;
    private String description;
    private String category;

    @NotNull(message = "price is required")
    @DecimalMin(value = "0.0",inclusive = false,message = "price must be greater than zero")
    @Column(nullable = false)
    private BigDecimal price;

    @NotNull(message = "stock quantity is required")
    @Min(value = 0,message = "cannot be less than 0")
    @Column(nullable = false,name = "stock_quality")
    private Integer stockQuality;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderItem>orderItems;
}
