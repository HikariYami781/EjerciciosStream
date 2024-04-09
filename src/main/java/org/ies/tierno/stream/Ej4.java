package org.ies.tierno.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Ej4 {
    /*

Un método sum10(List<Integer> numbers)
 que dado una lista de enteros, devuelve
  otra lista de enteros del mismo tamaño
   en la que se le ha sumado 10 a cada número
   de la primera lista.
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 7, 13, 24,50);
        List<Integer> result = sum10(numbers);
        System.out.println("Lista original: " + numbers);
        System.out.println("Lista con 10 sumado a cada elemento: " + result);
    }

    public  static List<Integer> sum10(List<Integer> numbers){
        return numbers
                .stream()
                .map(num->num+10) //sumar 10 a cada elemento
                .collect(Collectors.toList()); //Ponemos los resultados en una nueva lista
    }
}
