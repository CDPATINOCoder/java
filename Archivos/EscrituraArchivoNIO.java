import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EscrituraArchivoNIO {

    public static void main (String[] args) {

        List<String> lineas = Arrays.asList("linea 1", "linea 2", "linea 3", "linea 4", "linea 5", "linea 6");
        try {
            Files.write(Paths.get("salida2.txt"), lineas);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

}
