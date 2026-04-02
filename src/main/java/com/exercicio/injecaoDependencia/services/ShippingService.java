package com.exercicio.injecaoDependencia.services;

import com.exercicio.injecaoDependencia.entities.Order;

public class ShippingService {

    public double shipment(Order order){
        if(order.getBasic() < 100.00){
            return order.getBasic() + 20.00;
        }else if(order.getBasic() <= 200.00){
            return order.getBasic() + 12.00;
        }
        return order.getBasic();
    }
}
