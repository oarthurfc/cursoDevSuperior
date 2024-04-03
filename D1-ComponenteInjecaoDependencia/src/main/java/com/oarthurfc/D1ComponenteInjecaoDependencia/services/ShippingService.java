package com.oarthurfc.D1ComponenteInjecaoDependencia.services;

import com.oarthurfc.D1ComponenteInjecaoDependencia.entities.Order;

public class ShippingService {
    public static double shipment(Order order) {
        double orderPrice = order.getBasic();
        double shippingPrice = 0.0;

        if (orderPrice < 100.0) {
            shippingPrice = 20.0;
        } else if (orderPrice >= 100.0 && orderPrice <= 200.0 ) {
            shippingPrice = 12.0;
        }
        return shippingPrice;
    }
}
