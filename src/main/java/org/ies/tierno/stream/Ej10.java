package org.ies.tierno.stream;
import java.util.List;
import java.util.Optional;
public class Ej10 {
    /*
    Un método max(List<Double> numbers )
    que busca el máximo de los números en
    la lista. Si la lista está vacía devuelve null.
     */

    public static void main(String[] args) {
        List<Double> numbers = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        Double maxNumber = max(numbers);
        System.out.println("El máximo de los números en la lista es: " + maxNumber);
    }

    public static Double max(List<Double> numbers) {
        Optional<Double> result = numbers
                .stream()
                .max(Double::compareTo); // Encuentra el máximo

        return result.orElse(null); // Devuelve el máximo sino null
    }
}
