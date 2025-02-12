public class TryCatchExample {

    public static void main (String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException error) {
            System.out.println("Error: Division por cero");
            System.out.println("Mensaje de Error: " + error.getMessage());
        }

    }

}
