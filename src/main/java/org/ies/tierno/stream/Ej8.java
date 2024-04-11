package org.ies.tierno.stream;

import java.util.List;

public class Ej8 {
    /*

Un método sum(List<Double> numbers )
que calcula la suma de los números en
 la lista, si la lista está vacía devuelve 0.
     */

    public static void main(String[] args) {
        List<Double> numbers = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        double sum = sum(numbers);
        System.out.println("La suma de los números en la lista es: " + sum);
    }

    public static double sum(List<Double> numbers) {
        return numbers
                .stream()
                .mapToDouble(Double::doubleValue) // Convertir cada Double
                .sum(); // Sumar todos los números en el Stream
    }
}
