package com.stephenmeaney.data.entity;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@Table(name = "order_line_item")
public class OrderLineItem {

    @Id
    @GeneratedValue
    @Column(name = "order_line_item_id")
    private long orderLineItemId;

    private int quantity;

    private double price;

//    @Column(name = "total_price")
//    @Formula("quantity * price")
//    private double totalPriceYo;

    @ManyToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public long getOrderLineItemId() {
        return orderLineItemId;
    }

    public void setOrderLineItemId(long orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}