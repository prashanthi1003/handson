package com.handson.model;

import java.math.BigDecimal;

public class Product {

    private Integer no;

    private String name;

    private BigDecimal price;

    private Integer sellerNo;

    public Product(Integer no, String name, BigDecimal price, Integer sellerNo) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.sellerNo = sellerNo;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(Integer sellerNo) {
        this.sellerNo = sellerNo;
    }
}
