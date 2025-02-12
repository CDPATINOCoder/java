public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    public Charmander(int numPokedex, String nombrePokemon, String sexo, String temporadaQueAparece, String tipo, double pesoPokemon) {
        super(numPokedex, nombrePokemon, sexo, temporadaQueAparece, tipo, pesoPokemon);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Soy Charmander y estoy atacando con aranazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con mordisco");
    }


    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con punio Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con lanzallamas");
    }


}
