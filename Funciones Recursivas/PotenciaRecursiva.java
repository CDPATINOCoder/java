public class PotenciaRecursiva {

    public static void main (String[] args) {
        System.out.println(calcularPotenciaRecursiva(2, 4));
    }

    public static int calcularPotenciaRecursiva(int a, int b) {
        if (b == 1) {
            return a;
        }

        return a * calcularPotenciaRecursiva(a, b - 1);
    }
}
