package com.stephenmeaney.data.repository;

import com.stephenmeaney.business.domain.OrderSummary;
import com.stephenmeaney.data.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {

    List<OrderSummary> findAllProjectedByAccount_AccountIdOrderByOrderDateAsc(long id);
}
