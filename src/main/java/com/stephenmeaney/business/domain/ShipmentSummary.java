package com.stephenmeaney.business.domain;

import com.stephenmeaney.data.entity.Shipment;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ShipmentSummary", types = Shipment.class)
public interface ShipmentSummary {
}
