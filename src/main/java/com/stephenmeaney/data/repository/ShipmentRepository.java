package com.stephenmeaney.data.repository;

import com.stephenmeaney.data.entity.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Long> {
}
