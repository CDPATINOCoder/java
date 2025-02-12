public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    public Squirtle(int numPokedex, String nombrePokemon, String sexo, String temporadaQueAparece, String tipo, double pesoPokemon) {
        super(numPokedex, nombrePokemon, sexo, temporadaQueAparece, tipo, pesoPokemon);
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy atacando con hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con hidropulso");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con placeaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Soy Squirtle y estoy atacando con aranazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con mordisco");
    }
}
