import java.util.ArrayList;
import java.util.List;

public class EjercicioIntegrador {

    public static void main (String[] args) {

        Bulbasaur p1 = new Bulbasaur(1, "Bulbasaur", "Masculino", "Invierno", "Planta", 22.2);
        Squirtle p2 = new Squirtle(2, "Squirtle", "Masculino", "Invierno", "Planta", 22.2);
        Pikachu p3 = new Pikachu(3, "Pikachu", "Masculino", "Invierno", "Planta", 22.2);
        Charmander p4 = new Charmander(4, "Charmander", "Masculino", "Invierno", "Planta", 22.2);

        p1.atacarAranazo();
        p2.atacarAranazo();
        p3.atacarAranazo();
        p4.atacarAranazo();
        p1.atacarHojaAfilada();
        p2.atacarHidrobomba();
        p3.atacarImpactTrueno();
        p4.atacarLanzallamas();



        List<Pokemon> lista = new ArrayList<Pokemon>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);


        for(Pokemon p : lista) {
            p.atacarAranazo(); // Todos los Pokémon atacan con Arañazo
        }

        p4.mostrarInfo();


    }

}
