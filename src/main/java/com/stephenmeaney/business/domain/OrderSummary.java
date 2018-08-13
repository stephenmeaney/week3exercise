package com.stephenmeaney.business.domain;

import com.stephenmeaney.data.entity.Account;
import com.stephenmeaney.data.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;
import java.util.List;

@Projection(name = "OrderSummary", types = Account.class)
public interface OrderSummary {

    String getOrderNumber();
    Timestamp getOrderDate();
    double getTotalPrice();

    AddressSummary getAddress();
    List<OrderLineItemSummary> getOrderLineItemList();

    interface AddressSummary {
        String getStreet();
        String getCity();
        String getStateProvince();
        String getZipPostalCode();
        String getCountry();
    }

    interface OrderLineItemSummary {
        int getQuantity();
        double getPrice();
        double getTotalPrice();

        ProductSummary getProduct();
        OrderShipmentSummary getShipment();


        interface ProductSummary {
            String getName();
            String getDescription();
            double getPrice();
        }

        interface OrderShipmentSummary {
            Timestamp getShippedDate();
            Timestamp getDeliveryDate();
        }

    }

}
