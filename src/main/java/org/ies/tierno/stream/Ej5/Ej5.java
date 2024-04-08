package org.ies.tierno.stream.Ej5;

import java.util.List;
import java.util.stream.Collectors;

public class Ej5 {
    /*

Un método List<String>
mapToEmails(List<Student> students)
 que dada una lista de estudiantes,
 devuelva una lista de los emails de los
 estudiantes en el mismo orden
     */

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Paula", "paula@example.com"),
                new Student("Carlos", "carlos@example.com"),
                new Student("Sara", "sara@example.com")
        );

        List<String> emails = mapToEmails(students);
        System.out.println("Lista de correos electrónicos de los estudiantes:");
        emails.forEach(System.out::println);

    }
    public static List<String> mapToEmails(List<Student> students) {
        return students.stream()  //convierte la lista en Stream
                .map(Student::getEmail) // Obtener el email de cada estudiante
                .collect(Collectors.toList()); // Recolectar los emails en una nueva lista
    }




}
