package org.ies.tierno.stream;

public class Ej14 {
    /*
    Un método que dado una lista de pedidos,
    devuelve el precio total de todos los pedidos
     */
    public Double getPrice(List<Order> orders) {
        return orders.stream()
                .map(order -> order.getPrice())
                .reduce(0d, (p1, p2) -> p1 + p2);
    }
}

