package com.stephenmeaney.data.repository;

import com.stephenmeaney.business.domain.ShipmentSummary;
import com.stephenmeaney.data.entity.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Long> {

    List<ShipmentSummary> findAllProjectedByAccount_AccountIdOrderByDeliveryDateAsc(long id);
}
