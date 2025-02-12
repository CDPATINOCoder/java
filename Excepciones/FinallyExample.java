public class FinallyExample {

    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[2]); // Índice válido (3)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango.");
        } finally {
            System.out.println("Este bloque siempre se ejecuta.");
        }
    }

}
