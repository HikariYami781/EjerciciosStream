package org.ies.tierno.stream.Ej6;

import java.util.List;
import java.util.stream.Collectors;

public class Ej6 {
    /*

Un método List<Student>
filterByZipCode(List<Student> students, int zipCode)
que dada una lista de estudiantes y un código postal,
 devuelva una lista con los estudiantes que vivan en ese
  código postal
     */

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Paula", "45 C/ Falsa", 12345),
                new Student("Ana", "45 C/ False", 54321),
                new Student("Elena", "78 C/ Tree", 45617)
        );

        int targetZipCode = 12345;
        List<Student> studentsInZipCode = filterByZipCode(students, targetZipCode);
        System.out.println("Estudiantes que viven en el código postal " + targetZipCode + ":");
        studentsInZipCode.forEach(System.out::println);


    }

    public static List<Student> filterByZipCode(List<Student> students, int zipCode) {
        return students
                .stream()
                .filter(student -> student.getZipCode() == zipCode) // Filtrar estudiantes por CP
                .collect(Collectors.toList()); // Estudiantes filtrados en una nueva lista
    }
}
