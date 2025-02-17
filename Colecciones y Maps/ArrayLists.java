import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Cesar", 20));
        lista.add(new Persona(2, "Dani", 21));
        lista.add(new Persona(3, "Theo", 21));
        lista.add(new Persona(4, "Carlos", 22));
        lista.add(0, new Persona(5, "Luis", 23));
        lista.add(4, new Persona(6, "Luis", 24));
        System.out.println(lista.get(3));

        System.out.println("----------Acceso del toString----------");
        System.out.println(lista.get(0));

        System.out.println("----------FOR----------");
        for (int i = 0 ; i < lista.size() ; i++) {
            System.out.println(lista.get(i).getNombre());
        }

        System.out.println("----------FOR EACH----------");
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }

        Persona dani = lista.get(1);
        dani.setEdad(25);
        System.out.println(dani.getEdad());

        Persona mathias = new Persona(5, "Mathias", 23);
        lista.set(3, mathias);

        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

        System.out.println("----------FOR EACH----------");
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }

        //Herencia
        Persona Cesar = new Empleado(6, "Cesar", 23, 3500000);
        System.out.println(Cesar);

        //Polimorfismo
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona());
        personas.add(new Empleado());
        for(Persona p : personas) {
            System.out.println(p.getNombre());
        }
        System.out.println(personas.get(0));
        Persona persona = new Persona();
        Empleado empleado = new Empleado();
        persona = empleado;
        empleado = (Empleado) persona;
    }
}
