package org.ies.tierno.stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Ej11 {
    /*

Un método min(List<Double> numbers )
que busca el mínimo de los números en la lista.
Si la lista está vacía devuelve null.
     */

    public static void main(String[] args) {
        List<Double> numbers= List.of(1.8,2.7,8.0,9.2,10.0,20.5,50.0);
        Double minNumber= min(numbers);
        System.out.println("El minimo de los numeros de la lista es: "+minNumber);
    }

    public static Double min(List<Double> numbers){
        Optional<Double> result= numbers
                .stream()
                .min(Double::compareTo); //Encuentra el minimo

        return  result.orElse(null); //Devuelve el min, sino null
    }
}
