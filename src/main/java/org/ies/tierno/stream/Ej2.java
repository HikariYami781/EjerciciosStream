package org.ies.tierno.stream;

import java.util.List;

public class Ej2 {
    /*

Escribe un método first(List<Integer> list)
 que dada una lista de String y devuelva el que
 está en la primera posición. Si la lista está vacía devuelve null.
     */

    public static void main(String[] args) {
        List<Integer> listF= List.of(4,5,6,7,8,9,10);
        Integer firstElement= first (listF);
        System.out.println("El primer elemento de la lista es "+firstElement);
    }

    public static Integer first(List<Integer> list){
        return list
                .stream()
                .findFirst() //Busca el primer elemento del Stream
                .orElse(null); //Devuelve null si esta vacio
    }
}
