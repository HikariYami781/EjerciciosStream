package org.ies.tierno.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Ej7 {
    /*
    Un método que recibe una lista de
     números enteros (numbers) y devuelve
      otra lista con los números pares que
      había en numbers
     */

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Números pares en la lista original: " + evenNumbers);


    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(num -> num % 2 == 0) // Filtrar pares
                .collect(Collectors.toList()); // Números pares en una nueva lista
    }
}
