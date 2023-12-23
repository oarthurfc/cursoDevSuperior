package com.oarthurfc.D1ComponenteInjecaoDependencia.services;

import com.oarthurfc.D1ComponenteInjecaoDependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public static double total(Order order) {
        double shipmentePrice = ShippingService.shipment(order);
        double discount = 1 - (order.getDiscount() / 100.0);
        return order.getBasic() * discount + shipmentePrice;
    }
}
