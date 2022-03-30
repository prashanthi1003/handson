package com.handson.model;

import java.math.BigDecimal;

public class Product {

    private Integer no;

    private String name;

    private BigDecimal price;

    private Seller seller;

    public Product(Integer no, String name, BigDecimal price, Seller seller) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.seller = seller;
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

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
