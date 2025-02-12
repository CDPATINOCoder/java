public class StringInvertido {
    public static String invertirCadena(String str) {
        // Caso base: Si la cadena está vacía o tiene un solo carácter, la devolvemos tal cual.
        if (str.length() <= 1) {
            return str;
        }

        // Paso recursivo: Tomamos el primer carácter y lo colocamos al final de la recursión.
        return invertirCadena(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String palabra = "hola";
        String resultado = invertirCadena(palabra);
        System.out.println("Invertido: " + resultado); // Debería imprimir "aloh"
    }
}
