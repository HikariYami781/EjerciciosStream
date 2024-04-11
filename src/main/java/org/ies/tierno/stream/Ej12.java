package org.ies.tierno.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ej12 {
    /*
    Un método junction(List<Double> numbers1 ,
    List<Double> numbers2) que dadas dos listas
    de números, devuelve los números que están tanto
     numbers1 como en numbers2
     */

    public static void main(String[] args) {
        List<Double> numbers1 = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        List<Double> numbers2 = List.of(3.5, 4.5, 5.5, 6.5, 7.5);
        List<Double> commonNumbers = junction(numbers1, numbers2);
        System.out.println("Números en común entre las dos listas: " + commonNumbers);

    }
    public static List<Double> junction(List<Double> numbers1, List<Double> numbers2) {
        Set<Double> set1 = numbers1
                .stream()
                .collect(Collectors.toSet()); // Convertir la primera lista a un conjunto

        return numbers2
                .stream()
                .filter(set1::contains) // Filtrar los números de la segunda lista que están en el conjunto de la primera lista
                .collect(Collectors.toList()); // números comunes en una nueva lista
    }
}
