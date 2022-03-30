package com.handson.main;

import com.handson.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductGrouping {

    public static void main(String[] args) {
        // Given list of products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "iPhone 13 Pro", new BigDecimal(5000), 1));
        productList.add(new Product(2, "Adidas T-Shirt", new BigDecimal(130), 2));
        productList.add(new Product(3, "iPhone X", new BigDecimal(2500), 1));
        productList.add(new Product(4, "Xiaomi OCOOKER Dual Side", new BigDecimal(175), 3));

        // Do grouping and display the products base on its sellerNo
    }

}
