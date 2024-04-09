package org.ies.tierno.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ej1 {

    /*
    Escribe un programa que cree un ArrayList y lo rellene con
     varios String. Luego conviértelo en un Stream y recórrelo
     mostrando en pantalla cada elemento.
     */

    public static void main(String[] args) {
        List<String> listaS= new ArrayList<>();
        listaS.add("Hola");
        listaS.add("Mundo");
        listaS.add("Mi");
        listaS.add("Nombre");
        listaS.add("Es");
        listaS.add("Paula");

        listaS
                .stream()  //Convertimos la lista en Stream
                .forEach(System.out::println); //Recorremos la lista

    }
}
