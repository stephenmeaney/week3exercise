package com.stephenmeaney.business.domain;

import com.stephenmeaney.data.entity.Shipment;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;
import java.util.List;

@Projection(name = "ShipmentSummary", types = Shipment.class)
public interface ShipmentSummary {

    Timestamp getShippedDate();
    Timestamp getDeliveryDate();

    List<OrderLineItemSummary> getOrderLineItemList();

    interface OrderLineItemSummary {

        String getOrderNumber();
        int getQuantity();
        String getProductName();
    }

}
