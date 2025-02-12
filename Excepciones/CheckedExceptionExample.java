import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CheckedExceptionExample {

    public static void main (String[] args) {
        File archivo = new File("datos.txt");
        try {
            Scanner lector = new Scanner(archivo);
        } catch (FileNotFoundException error) {
            System.out.println("Archivo no encontrado " + error.getMessage());
        }
    }

}
