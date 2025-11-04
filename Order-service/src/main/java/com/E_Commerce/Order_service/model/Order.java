package com.E_Commerce.Order_service.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private Integer quantity;
    private Double totalPrice;
    private String status; // e.g., "PLACED", "CANCELLED", "SHIPPED"
}
