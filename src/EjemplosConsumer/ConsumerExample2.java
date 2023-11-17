package EjemplosConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Utilizando Consumer para imprimir el cuadrado de cada número
        Consumer<Integer> imprimirCuadrado = numero ->
                System.out.println("Cuadrado de " + numero + ": " + (numero * numero));

        // Aplicar el Consumer a cada elemento de la lista
        System.out.println("Cuadrados de los números:");
        numeros.forEach(imprimirCuadrado);
    }
}

