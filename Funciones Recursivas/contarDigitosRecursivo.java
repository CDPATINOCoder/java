public class contarDigitosRecursivo {
    public static void main (String[] args) {
        int numero = 3412124;
        int digitos = contarDigitos(numero);
        System.out.println(digitos);
    }

    public static int contarDigitos(int num) {
        if (num >= 0 && num <= 9) {
            return 1;
        }

        return contarDigitos(num / 10) + 1;
    }

}
