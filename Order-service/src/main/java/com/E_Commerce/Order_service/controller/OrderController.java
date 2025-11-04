package com.E_Commerce.Order_service.controller;
import com.E_Commerce.Order_service.dto.OrderResponseDTO;
import com.E_Commerce.Order_service.model.Order;
import com.E_Commerce.Order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;




    // Place new order
    @PostMapping("/place")
    public Mono<ResponseEntity<OrderResponseDTO>> placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order)
                .map(ResponseEntity::ok);
    }

    // Get all orders
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Get order by ID
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    // Delete order
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.ok("Order deleted successfully");
    }
}
