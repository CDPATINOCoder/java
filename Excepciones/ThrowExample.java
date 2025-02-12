public class ThrowExample {

    public static void main (String[] args) {

        int edad = 15;
        try {
            if (edad < 19) {
                throw new ArithmeticException("Acceso Denegado: Menor de edad");
            }
            System.out.println("Bienvenido");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        }

    }

}
