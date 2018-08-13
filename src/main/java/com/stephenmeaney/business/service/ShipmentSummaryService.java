package com.stephenmeaney.business.service;

import com.stephenmeaney.business.domain.ShipmentSummary;
import com.stephenmeaney.data.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentSummaryService {

    private ShipmentRepository shipmentRepository;

    @Autowired
    public ShipmentSummaryService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public List<ShipmentSummary> getShipmentSummaryProjection(long accountId) {
        return shipmentRepository.findAllProjectedByAccount_AccountIdOrderByDeliveryDateAsc(accountId);
    }
}
