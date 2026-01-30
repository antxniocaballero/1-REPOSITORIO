import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos usuarios desea crear?: ");
        int cantidad = sc.nextInt();
        
        Usuario[] lista = crearUsuarios(cantidad);
        
        System.out.println("\n--- Lista de Usuarios ---");
        for (Usuario u : lista) {
            System.out.println("Nombre: " + u.nombre + " " + u.apellidos + " | Email: " + u.email);
        }
    }

    public static Usuario[] crearUsuarios(int n) {
        Scanner sc = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[n];
        
        for (int i = 0; i < n; i++) {
            usuarios[i] = new Usuario();
            System.out.println("\nUsuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            usuarios[i].nombre = sc.nextLine();
            System.out.print("Apellidos: ");
            usuarios[i].apellidos = sc.nextLine();
            System.out.print("Email: ");
            usuarios[i].email = sc.nextLine();
        }
        return usuarios;
    }
}
