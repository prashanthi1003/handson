package com.handson.model;

import java.math.BigDecimal;

public class Order {

    private Integer orderNo;

    private Integer productNo;

    private Integer quantity;

    private BigDecimal price;

    private Seller seller;

    public Order(Integer orderNo, Integer productNo, Integer quantity, BigDecimal price, Seller seller) {
        this.orderNo = orderNo;
        this.productNo = productNo;
        this.quantity = quantity;
        this.price = price;
        this.seller = seller;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getProductNo() {
        return productNo;
    }

    public void setProductNo(Integer productNo) {
        this.productNo = productNo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
