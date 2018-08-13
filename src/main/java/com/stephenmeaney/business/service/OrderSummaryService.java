package com.stephenmeaney.business.service;

import com.stephenmeaney.business.domain.OrderSummary;
import com.stephenmeaney.data.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSummaryService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderSummaryService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderSummary> getOrderProjection() {
        return orderRepository.findAllProjectedBy();
    }
}
