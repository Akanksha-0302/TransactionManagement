package com.akanksha.Transactionmanagement.service;

import com.akanksha.Transactionmanagement.repo.OrderRepository;
import entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data

public class OrederHandler {

    private final OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return   orderRepository.save(order);

    }
}
