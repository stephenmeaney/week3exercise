package com.stephenmeaney.data.repository;

import com.stephenmeaney.data.entity.OrderLineItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineItemRepository extends CrudRepository<OrderLineItem, Long> {
}
