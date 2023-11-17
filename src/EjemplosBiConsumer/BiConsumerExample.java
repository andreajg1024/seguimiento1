package EjemplosBiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        // Utilizando BiConsumer para imprimir clave y valor de un mapa
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Carlos", 22);

        BiConsumer<String, Integer> imprimirEdad = (nombre, edad) ->
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);

        System.out.println("Edades:");
        edades.forEach(imprimirEdad);
    }
}

