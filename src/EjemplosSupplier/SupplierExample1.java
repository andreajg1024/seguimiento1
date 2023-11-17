package EjemplosSupplier;

import java.util.function.Supplier;

public class SupplierExample1 {

    public static void main(String[] args) {
        // Utilizando Supplier para generar una cadena aleatoria
        Supplier<String> generarCadenaAleatoria = () -> {
            StringBuilder cadena = new StringBuilder();
            String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for (int i = 0; i < 8; i++) {
                int indice = (int) (Math.random() * caracteres.length());
                cadena.append(caracteres.charAt(indice));
            }
            return cadena.toString();
        };

        // Imprimir la cadena generada
        System.out.println("Cadena aleatoria: " + generarCadenaAleatoria.get());
    }
}

