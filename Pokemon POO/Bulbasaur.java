public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    public Bulbasaur(int numPokedex, String nombrePokemon, String sexo, String temporadaQueAparece, String tipo, double pesoPokemon) {
        super(numPokedex, nombrePokemon, sexo, temporadaQueAparece, tipo, pesoPokemon);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Soy Bulbasaur y estoy atacando con aranazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Bulbasaur y estoy atacando con mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y estoy atacando con hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y estoy atacando con latigo cepa");
    }
}
