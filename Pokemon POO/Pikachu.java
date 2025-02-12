public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(){}

    public Pikachu(int numPokedex, String nombrePokemon, String sexo, String temporadaQueAparece, String tipo, double pesoPokemon) {
        super(numPokedex,nombrePokemon, sexo, temporadaQueAparece, tipo, pesoPokemon );
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Soy Pikachu y estoy atacando con aranazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con mordisco");
    }

    @Override
    public void atacarImpactTrueno() {
        System.out.println("Soy pikachu y estoy atacando con impact trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con puniotrueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con rayo de carga");
    }
}
