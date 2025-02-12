public class FibonacciRecursivo {

    public static void main(String[] args) {
        int numero = 7;
        int resultado = fibonacci(numero);
        System.out.println(resultado);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci (n - 1) + fibonacci (n - 2);
    }

}
