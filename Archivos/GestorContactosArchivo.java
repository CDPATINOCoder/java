import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorContactosArchivo {

    private static final String ARCHIVO = "contactos.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> contactos = new ArrayList<>();

        try {
            contactos = Files.readAllLines(Paths.get(ARCHIVO));
        } catch (IOException e) {
            System.out.println("Creando nuevo archivo...");
        }

        System.out.println("Nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.println("Telefono del contacto: ");
        String telefono = scanner.nextLine();

        contactos.add(nombre + "," + telefono);

        try {
            Files.write(Paths.get(ARCHIVO), contactos);
            System.out.println("Contacto agregado!");
        } catch (IOException e) {
            System.err.println("Error al guardar " + e.getMessage());
        }

        scanner.close();

    }

}
