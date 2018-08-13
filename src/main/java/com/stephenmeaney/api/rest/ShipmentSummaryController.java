package com.stephenmeaney.api.rest;

import com.stephenmeaney.business.domain.ShipmentSummary;
import com.stephenmeaney.business.service.ShipmentSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shipment-summary")
public class ShipmentSummaryController {

    private ShipmentSummaryService shipmentSummaryService;

    @Autowired
    public ShipmentSummaryController(ShipmentSummaryService shipmentSummaryService) {
        this.shipmentSummaryService = shipmentSummaryService;
    }

    @GetMapping("/{accountId}")
    public List<ShipmentSummary> getShipmentSummary(@PathVariable("accountId") long accountId) {
        return shipmentSummaryService.getShipmentSummaryProjection(accountId);
    }
}
