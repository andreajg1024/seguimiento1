package EjemplosBiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {
        // Crear un mapa de estudiantes y sus calificaciones
        Map<String, Integer> calificaciones = new HashMap<>();
        calificaciones.put("Juan", 90);
        calificaciones.put("María", 85);
        calificaciones.put("Carlos", 78);

        // Utilizar BiConsumer para imprimir los nombres y calificaciones de los estudiantes
        BiConsumer<String, Integer> imprimirCalificacion = (nombre, calificacion) ->
                System.out.println("Estudiante: " + nombre + ", Calificación: " + calificacion);

        System.out.println("Calificaciones de Estudiantes:");
        calificaciones.forEach(imprimirCalificacion);
    }
}

