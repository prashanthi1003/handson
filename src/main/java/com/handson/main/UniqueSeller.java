package com.handson.main;

import com.handson.model.Order;
import com.handson.model.Seller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UniqueSeller {

    public static void main(String[] args) {
        // Given list of orders
        List<Order> orderList = new ArrayList<>();
        Seller sellerA = new Seller(1, "Seller A");
        orderList.add(new Order(1, 2, 1, new BigDecimal(5000), sellerA));
        orderList.add(new Order(2, 1, 1, new BigDecimal(130), new Seller(2, "Adidas Official Seller")));
        orderList.add(new Order(3, 3, 2, new BigDecimal(2500), sellerA));
        orderList.add(new Order(4, 4, 1, new BigDecimal(175), new Seller(3, "Xiomi Malaysia")));

        // TODO: Display seller no and seller name uniquely

    }
}
