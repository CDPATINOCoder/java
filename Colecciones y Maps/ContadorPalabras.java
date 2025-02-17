import java.util.Map;
import java.util.HashMap;

public class ContadorPalabras {

    public static void main(String[] args) {

        String texto = "Hola amigos como estan, Hola estan";
        HashMap<String, Integer> contador = new HashMap<>();

        for (String palabra : texto.toLowerCase().replaceAll("[^a-zA-ZáéíóúñÁÉÍÓÚ]", " ")
                .split("\\s+")) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        contador.forEach((k, v) -> System.out.println(k + ": " + v));

    }

}
