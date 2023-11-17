package EjemplosSupplier;

import java.util.function.Supplier;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SupplierExample2 {

    public static void main(String[] args) {
        // Utilizando Supplier para obtener la fecha y hora actual
        Supplier<String> obtenerFechaYHora = () -> {
            LocalDateTime fechaYHoraActual = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return fechaYHoraActual.format(formatter);
        };

        // Imprimir la fecha y hora actual
        System.out.println("Fecha y hora actual: " + obtenerFechaYHora.get());
    }
}

