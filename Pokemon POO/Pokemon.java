public abstract class Pokemon {

    private int numPokedex;
    private String nombrePokemon, sexo, temporadaQueAparece, tipo;
    private double pesoPokemon;

    public Pokemon() {}

    public Pokemon(int numPokedex, String nombrePokemon, String sexo, String temporadaQueAparece, String tipo, double pesoPokemon) {
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
        this.pesoPokemon = pesoPokemon;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }
    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setTemporadaQueAparece(String temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }
    public int getNumPokedex() {
        return numPokedex;
    }
    public String getNombrePokemon() {
        return nombrePokemon;
    }
    public String getSexo() {
        return sexo;
    }
    public String getTemporadaQueAparece() {
        return temporadaQueAparece;
    }
    public String getTipo() {
        return tipo;
    }
    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public abstract void atacarPlacaje();

    public abstract void atacarAranazo();

    public abstract void atacarMordisco();

    public void mostrarInfo(){
        System.out.println(getNombrePokemon() + getSexo() + getTemporadaQueAparece() + getTipo() + getPesoPokemon());
    }

}
