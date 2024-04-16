package org.ies.tierno.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Ej13 {
    /*
    Un método que dado una lista de pedidos,
    devuelve una lista con los precios de cada pedido
     */
    public List<Double> getPrices(List<Order> orders) {
        return orders.stream()
                .map(order -> order.getPrice())
                .collect(Collectors.toList());
    }
}
