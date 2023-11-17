package EjemplosConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        // Utilizando Consumer para imprimir cada elemento de la lista
        Consumer<String> imprimirNombre = nombre -> System.out.println("Nombre: " + nombre);
        nombres.forEach(imprimirNombre);

        // Utilizando BiConsumer para imprimir el índice y el nombre de cada elemento
        System.out.println("\nÍndice y Nombre:");
        Consumer<Integer> imprimirIndice = indice ->
                imprimirNombre.accept(nombres.get(indice));

        for (int i = 0; i < nombres.size(); i++) {
            imprimirIndice.accept(i);
        }
    }
}

