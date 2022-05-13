package com.handson.main;

import com.handson.model.Product;
import com.handson.model.Seller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductGrouping {

    public static void main(String[] args) {
        // Given list of products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "iPhone 13 Pro", new BigDecimal(5000), new Seller(1, "Seller A")));
        productList.add(new Product(2, "Adidas T-Shirt", new BigDecimal(130), new Seller(2, "Adidas Official Seller")));
        productList.add(new Product(3, "iPhone X", new BigDecimal(2500), new Seller(1, "Seller A")));
        productList.add(new Product(4, "Xiaomi OCOOKER Dual Side", new BigDecimal(175), new Seller(3, "Xiomi Malaysia")));

        // Do grouping and display the products base on its sellerNo
        Map<String, String> sellerProductMap = new HashMap<>();
        for(int i=0; i<productList.size(); i++){
            String seller = productList.get(i).getSeller().getName();
            System.out.println(seller);
            for(int j=0; j<productList.size(); j++){
                if(productList.get(i).getSeller().getName() == seller){
                    System.out.println(productList.get(i).getName());
                    break;
                }
            }
            /*if(productList.contains(productList.get(i))){
                sellerProductMap.put(productList.get(i).getSeller().getName(), productList.get(i).getName());
                System.out.println(sellerProductMap);
            }*/


        }


    }

}
