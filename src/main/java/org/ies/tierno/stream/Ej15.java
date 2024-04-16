package org.ies.tierno.stream;

public class Ej15 {
    /*
    Un método que dado una lista de pedidos,
    devuelva una lista con todos los OrderItem
     */

    public List<OrderItem> getItems(List<Order> orders) {
        return orders.stream()
                .flatMap(order -> order.getItems().stream())
                .collect(Collectors.toList());
    }
}
