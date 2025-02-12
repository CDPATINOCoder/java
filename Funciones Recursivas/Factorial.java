
public class Factorial {

    public static void main (String[] args) {
        int numero = 5;
        int factorial = calcularFactorial(5);
        System.out.println(factorial);
    }

    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

}
