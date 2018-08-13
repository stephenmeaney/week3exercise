package com.stephenmeaney.api.rest;

import com.stephenmeaney.business.domain.OrderSummary;
import com.stephenmeaney.business.service.OrderSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order-summary")
public class OrderSummaryController {

    private OrderSummaryService orderSummaryService;

    @Autowired
    public OrderSummaryController(OrderSummaryService orderSummaryService) {
        this.orderSummaryService = orderSummaryService;
    }

    @GetMapping("/test2")
    public List<OrderSummary> getProjection() {
        return orderSummaryService.getOrderProjection();
    }
}
