public class ExceptionMethodsExample {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("Traza: ");
            e.printStackTrace();
            System.out.println("Descripción: " + e.toString());
        }
    }

}
