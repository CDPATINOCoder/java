import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.Buffer;


public class EscrituraArchivo {

    public static void main (String[] args) {

        String rutaArchivo = "salida.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write("linea 1");
            bw.newLine();
            bw.write("linea 2");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
