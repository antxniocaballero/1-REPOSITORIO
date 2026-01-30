import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFecha();
    }

    public static void mostrarFecha() {
        System.out.println("Fecha y hora: " + LocalDateTime.now());
    }
}