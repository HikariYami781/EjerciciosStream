package org.ies.tierno.stream;

import java.util.List;
import java.util.OptionalDouble;

public class Ej9 {
    /*
    Un método average(List<Double> numbers )
    que calcula la media de los números en la lista.
    Si la lista está vacía devuelve null.
     */

    public static void main(String[] args) {
        List<Double> numbers = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        Double average = average(numbers);
        System.out.println("La media de los números en la lista es: " + average);

    }
    public static Double average(List<Double> numbers) {
        OptionalDouble result = numbers
                .stream()
                .mapToDouble(Double::doubleValue) // Convertir cada Double
                .average();

         return result.isPresent() ? result.getAsDouble() : null; // Devolver la media si está presente,  sino null

    }
}
