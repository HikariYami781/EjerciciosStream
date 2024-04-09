package org.ies.tierno.stream;

import java.util.List;

public class Ej3 {
    /*
    Escribe un método last(List<Integer> list)
     que dada una lista de Integer y devuelva el
     que está en la última posición. Si la lista está
      vacía devuelve null. Prueba el método con una lista
       vacía y con otra con tres valores dentro.
     */

    public static void main(String[] args) {
        //Lista Vacía
        List<Integer>listaV= List.of();
        System.out.println("El ultimo elemento de la lista es: "+last(listaV));

        //Lista con 3 valores
        List<Integer> listaL =List.of(4,20,7);
        System.out.println("El ultimo elemento de la lista es: "+last(listaL));

    }

    public static Integer last(List<Integer> list){
        return list
                .stream()
                .reduce((first,second)->second) //Reducir la lista al ultimo elemento
                .orElse(null);  //En caso de que este vacía
    }

}
