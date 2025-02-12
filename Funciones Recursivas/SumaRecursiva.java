public class SumaRecursiva {
    public static void main (String[] args) {
        System.out.println(calcularSumaNatural(10));
    }

    public static int calcularSumaNatural (int n) {
        if (n == 1) {
            return 1;
        }

        return n + calcularSumaNatural(n-1);
    }
}
